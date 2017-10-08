# Problem
When using project checkout from VSC using GIT, file changes disappear in IntelliJ after the file got saved via `ctrl+s`/`cmd+s`. Hoverer the file got saved, git (f.e. used via terminal) tracks the change correct.
To see the changes in IJ user have to manually refresh files status via VCS menu.

## Extra informations
* .idea project files is created at repository root
* Project didn't have `pom.xml` but it have Maven structure
* repository for reproduction: https://github.com/michalczukm/intellij-vsc-integration-bug

## Affected versions
| OS                    | IJ version                                      |
|-----------------------|-------------------------------------------------|
| Ubuntu 16.04 LTS x64  | IntelliJ Ultimate 2017.2, build #IU-172.3968.16 |
| macOS 10.12/10.13 x64 | IntelliJ IDEA 2017.2.5, build #IU-172.4343.14   |

## Repro
* IntelliJ `VSC` -> `Checkout from Version Control` -> `Git` -> add repo via HTTPS or SSH
* If IntelliJ asks about create project files -> accept
* Run through defaults (Java SDK v.8), no libraries, no frameworks
* You should have git repo root detected
* Add some changes in any file -> You can see changes in `Default` change set
* Press `ctrl+s`, file gets saved -> You don't have any changes in `Default` change set (they disappear). VSC don't see any changes (but they exist)
* To see the changes user have to manually refresh files state via VCS menu