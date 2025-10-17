<#
Simple helper script to download Temurin JDK 25 installer to %TEMP% and print next steps.
Run in an elevated PowerShell if you want to auto-install the MSI.
#>
param(
    [switch]$AutoInstall
)

$msiUrl = 'https://github.com/adoptium/temurin25-binaries/releases/latest/download/OpenJDK25U-jdk_x64_windows_hotspot_latest.msi'
$msiPath = Join-Path $env:TEMP 'temurin25.msi'
Write-Host "Downloading JDK 25 MSI to: $msiPath"
Invoke-WebRequest -Uri $msiUrl -OutFile $msiPath -UseBasicParsing
Write-Host "Downloaded."

if ($AutoInstall) {
    Write-Host "Attempting silent install (requires Administrator rights)..."
    Start-Process msiexec.exe -ArgumentList "/i `"$msiPath`" /qn" -Wait -NoNewWindow
    if ($LASTEXITCODE -eq 0) {
        Write-Host "Install finished. You should set JAVA_HOME if needed."
    } else {
        Write-Host "Install may have failed or requires elevation. Run the installer manually: $msiPath"
    }
} else {
    Write-Host "To install, run the MSI at: $msiPath (run as Administrator)."
    Write-Host "Or rerun this script with -AutoInstall to try a silent install (requires elevation)."
}

Write-Host "After installation set JAVA_HOME to your JDK 25 path, then restart terminal / VS Code."