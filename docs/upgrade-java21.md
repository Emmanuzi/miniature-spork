# Upgrade to Java 25 (LTS)

This document contains step-by-step instructions to install and configure JDK 25 on Windows (PowerShell) and update the project to use it.

## 1) Install Eclipse Temurin (Adoptium) JDK 25 (PowerShell)

Run PowerShell as Administrator and execute:

```powershell
# Download Temurin JDK 25 MSI (adjust URL to latest patch if needed)
$msiUrl = 'https://github.com/adoptium/temurin25-binaries/releases/latest/download/OpenJDK25U-jdk_x64_windows_hotspot_latest.msi'
$msiPath = "$env:TEMP\temurin25.msi"
Invoke-WebRequest -Uri $msiUrl -OutFile $msiPath

# Install silently
Start-Process msiexec.exe -ArgumentList "/i `"$msiPath`" /qn" -Wait -NoNewWindow

# Remove downloaded installer
Remove-Item $msiPath -Force
```

If you prefer manual installation, download the Windows x64 MSI from: https://adoptium.net and run it.

## 2) Verify installation and path

```powershell
# Print installed Java version
java -version

# Print where java executable is found
Get-Command java | Select-Object -ExpandProperty Source
```

Typical installation path: `C:\Program Files\Eclipse Adoptium\jdk-25` or `C:\Program Files\Java\jdk-25`.

## 3) Set JAVA_HOME and update PATH (current user)

```powershell
$jdkPath = 'C:\Program Files\Java\jdk-25' # update if different
[System.Environment]::SetEnvironmentVariable('JAVA_HOME', $jdkPath, 'User')
$oldPath = [System.Environment]::GetEnvironmentVariable('Path', 'User')
if ($oldPath -notlike "*$jdkPath*") {
    [System.Environment]::SetEnvironmentVariable('Path', "$jdkPath\\bin;$oldPath", 'User')
}
# Reload environment in the current shell session (PowerShell)
$env:JAVA_HOME = $jdkPath
$env:Path = "$jdkPath\\bin;" + $env:Path
```

## 4) Configure VS Code Java extension to use JDK 25

Open `.vscode/settings.json` and update or add `java.configuration.runtimes` with the absolute path to your JDK 25 installation. Example:

```jsonc
"java.configuration.runtimes": [
  {
    "name": "JavaSE-25",
    "path": "C:\\Program Files\\Java\\jdk-25",
    "default": true
  }
]
```

Restart VS Code after making these changes.

## 5) Build and test the project

This workspace appears to be a simple sources-based project (no Maven/Gradle). To compile and run from the terminal:

```powershell
# Compile all .java files in src to bin targeting Java 25
javac --release 25 -d bin src\*.java
# Run the main class
java -cp bin App
```

If you use Maven or Gradle, update your `pom.xml` or `build.gradle` to set source/target/compatibility to 25.

## 6) Next steps if you want automated assistance

The workspace can be upgraded using the GitHub Copilot app modernization tools which generate an automated upgrade plan and OpenRewrite recipes. Those tools require a Copilot Pro/Enterprise plan and are blocked in this environment. If you have that plan available, run the upgrade plan generator in the workspace to get automated changes.

---

If you want, I can attempt to set `--release 25` compilation flags across the project or create simple scripts to compile with Java 25. Tell me which you'd prefer.
