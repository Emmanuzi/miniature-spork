## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Java 21 upgrade helpers

I added two small helper scripts under `scripts/` to make upgrading and running with Java 21 easier:

- `scripts/install-jdk21.ps1` — downloads the Temurin JDK 21 MSI and can attempt a silent install when run with `-AutoInstall` (requires Administrator).
- `scripts/compile-and-run.ps1` — compiles sources with `--release 21` into `bin` and runs the `App` class.

- `scripts/install-jdk25.ps1` — downloads the Temurin JDK 25 MSI and can attempt a silent install when run with `-AutoInstall` (requires Administrator).
- `scripts/compile-and-run.ps1` — compiles sources with `--release 25` into `bin` and runs the `App` class.

Run these from PowerShell (see `docs/upgrade-java21.md` for details):

```powershell
# download installer
.\scripts\install-jdk21.ps1

# optionally install (requires elevation)
.\scripts\install-jdk21.ps1 -AutoInstall

# compile and run
.\scripts\compile-and-run.ps1
```

Note: this workspace contains a legacy `src/` folder with older/duplicate files. The cleaned, convention-following sources are in `src2/` and the compile script and VS Code settings have been updated to use `src2`.

If you want to remove the legacy files, you can delete the `src/` folder locally after verifying `src2/` works for you.
