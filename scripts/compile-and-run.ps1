<#
Compile and run helper for this repository. Compiles all .java files in src to bin using --release 21 then runs App.
Usage: .\scripts\compile-and-run.ps1
#>
Set-StrictMode -Version Latest

# Ensure bin exists
$bin = Join-Path $PSScriptRoot '..\bin' | Resolve-Path -Relative -ErrorAction SilentlyContinue
if (-not (Test-Path (Join-Path $PSScriptRoot '..\bin'))) {
    New-Item -ItemType Directory -Path (Join-Path $PSScriptRoot '..\bin') | Out-Null
}

Push-Location (Join-Path $PSScriptRoot '..')
try {
    Write-Host "Compiling sources with --release 25 from src..."
    javac --release 25 -d bin src\*.java
    if ($LASTEXITCODE -ne 0) {
        Write-Host "javac returned non-zero exit. See errors above." -ForegroundColor Red
        exit $LASTEXITCODE
    }
    Write-Host "Running App..."
    java -cp bin App
} finally {
    Pop-Location
}
