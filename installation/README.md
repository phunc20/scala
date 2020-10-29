# Installation (via sdkman)
cf.
- [https://sdkman.io/install](https://sdkman.io/install)
- [https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html)
- [https://www.scala-lang.org/download/](https://www.scala-lang.org/download/)

An example installation:
```bash
~ ❯❯❯ curl -s "https://get.sdkman.io" | bash

                                -+syyyyyyys:
                            `/yho:`       -yd.
                         `/yh/`             +m.
                       .oho.                 hy                          .`
                     .sh/`                   :N`                `-/o`  `+dyyo:.
                   .yh:`                     `M-          `-/osysoym  :hs` `-+sys:      hhyssssssssy+
                 .sh:`                       `N:          ms/-``  yy.yh-      -hy.    `.N-````````+N.
               `od/`                         `N-       -/oM-      ddd+`     `sd:     hNNm        -N:
              :do`                           .M.       dMMM-     `ms.      /d+`     `NMMs       `do
            .yy-                             :N`    ```mMMM.      -      -hy.       /MMM:       yh
          `+d+`           `:/oo/`       `-/osyh/ossssssdNMM`           .sh:         yMMN`      /m.
         -dh-           :ymNMMMMy  `-/shmNm-`:N/-.``   `.sN            /N-         `NMMy      .m/
       `oNs`          -hysosmMMMMydmNmds+-.:ohm           :             sd`        :MMM/      yy
      .hN+           /d:    -MMMmhs/-.`   .MMMh   .ss+-                 `yy`       sMMN`     :N.
     :mN/           `N/     `o/-`         :MMMo   +MMMN-         .`      `ds       mMMh      do
    /NN/            `N+....--:/+oooosooo+:sMMM:   hMMMM:        `my       .m+     -MMM+     :N.
   /NMo              -+ooooo+/:-....`...:+hNMN.  `NMMMd`        .MM/       -m:    oMMN.     hs
  -NMd`                                    :mm   -MMMm- .s/     -MMm.       /m-   mMMd     -N.
 `mMM/                                      .-   /MMh. -dMo     -MMMy        od. .MMMs..---yh
 +MMM.                                           sNo`.sNMM+     :MMMM/        sh`+MMMNmNm+++-
 mMMM-                                           /--ohmMMM+     :MMMMm.       `hyymmmdddo
 MMMMh.                  ````                  `-+yy/`yMMM/     :MMMMMy       -sm:.``..-:-.`
 dMMMMmo-.``````..-:/osyhddddho.           `+shdh+.   hMMM:     :MmMMMM/   ./yy/` `:sys+/+sh/
 .dMMMMMMmdddddmmNMMMNNNNNMMMMMs           sNdo-      dMMM-  `-/yd/MMMMm-:sy+.   :hs-      /N`
  `/ymNNNNNNNmmdys+/::----/dMMm:          +m-         mMMM+ohmo/.` sMMMMdo-    .om:       `sh
     `.-----+/.`       `.-+hh/`         `od.          NMMNmds/     `mmy:`     +mMy      `:yy.
           /moyso+//+ossso:.           .yy`          `dy+:`         ..       :MMMN+---/oys:
         /+m:  `.-:::-`               /d+                                    +MMMMMMMNh:`
        +MN/                        -yh.                                     `+hddhy+.
       /MM+                       .sh:
      :NMo                      -sh/
     -NMs                    `/yy:
    .NMy                  `:sh+.
   `mMm`               ./yds-
  `dMMMmyo:-.````.-:oymNy:`
  +NMMMMMMMMMMMMMMMMms:`
    -+shmNMMMNmdy+:`


                                                                 Now attempting installation...


Looking for a previous installation of SDKMAN...
Looking for unzip...
Looking for zip...
Looking for curl...
Looking for sed...
Installing SDKMAN scripts...
Create distribution directories...
Getting available candidates...
Prime the config file...
Download script archive...
######################################################################## 100.0%
Extract script archive...
Install scripts...
Set version to 5.9.1+575 ...
Attempt update of interactive bash profile on regular UNIX...
Added sdkman init snippet to /home/phunc20/.bashrc
Attempt update of zsh profile...
Updated existing /home/phunc20/.zshrc



All done!


Please open a new terminal, or run the following in the existing one:

    source "/home/phunc20/.sdkman/bin/sdkman-init.sh"

Then issue the following command:

    sdk help

Enjoy!!!
~ ❯❯❯ source "/home/phunc20/.sdkman/bin/sdkman-init.sh"
~ ❯❯❯ sdk version
==== BROADCAST =================================================================
* 2020-10-26: jbang 0.52.1 available on SDKMAN! https://git.io/JT66L
* 2020-10-26: mvnd 0.0.10 available on SDKMAN! https://git.io/JTKYo
* 2020-10-25: grails 4.0.5 available on SDKMAN!
================================================================================

SDKMAN 5.9.1+575
~ ❯❯❯ sdk list java
================================================================================
Available Java Versions
================================================================================
 Vendor        | Use | Version      | Dist    | Status     | Identifier
--------------------------------------------------------------------------------
 AdoptOpenJDK  |     | 15.0.1.j9    | adpt    |            | 15.0.1.j9-adpt
               |     | 15.0.1.hs    | adpt    |            | 15.0.1.hs-adpt
               |     | 14.0.2.j9    | adpt    |            | 14.0.2.j9-adpt
               |     | 14.0.2.hs    | adpt    |            | 14.0.2.hs-adpt
               |     | 13.0.2.j9    | adpt    |            | 13.0.2.j9-adpt
               |     | 13.0.2.hs    | adpt    |            | 13.0.2.hs-adpt
               |     | 12.0.2.j9    | adpt    |            | 12.0.2.j9-adpt
               |     | 12.0.2.hs    | adpt    |            | 12.0.2.hs-adpt
               |     | 11.0.9.open  | adpt    |            | 11.0.9.open-adpt
               |     | 11.0.9.j9    | adpt    |            | 11.0.9.j9-adpt
               |     | 11.0.9.hs    | adpt    |            | 11.0.9.hs-adpt
               |     | 8.0.272.open | adpt    |            | 8.0.272.open-adpt
               |     | 8.0.272.j9   | adpt    |            | 8.0.272.j9-adpt
               |     | 8.0.272.hs   | adpt    |            | 8.0.272.hs-adpt
 Alibaba       |     | 11.0.8       | albba   |            | 11.0.8-albba
               |     | 8u262        | albba   |            | 8u262-albba
 Amazon        |     | 15.0.1       | amzn    |            | 15.0.1-amzn
               |     | 11.0.9       | amzn    |            | 11.0.9-amzn
               |     | 8.0.272      | amzn    |            | 8.0.272-amzn
 Azul Zulu     |     | 15.0.1       | zulu    |            | 15.0.1-zulu
               |     | 15.0.1.fx    | zulu    |            | 15.0.1.fx-zulu
               |     | 14.0.2       | zulu    |            | 14.0.2-zulu
               |     | 14.0.2.fx    | zulu    |            | 14.0.2.fx-zulu
               |     | 13.0.5       | zulu    |            | 13.0.5-zulu
               |     | 13.0.5.fx    | zulu    |            | 13.0.5.fx-zulu
               |     | 12.0.2       | zulu    |            | 12.0.2-zulu
               |     | 11.0.9       | zulu    |            | 11.0.9-zulu
               |     | 11.0.9.fx    | zulu    |            | 11.0.9.fx-zulu
               |     | 10.0.2       | zulu    |            | 10.0.2-zulu
               |     | 9.0.7        | zulu    |            | 9.0.7-zulu
               |     | 8.0.272      | zulu    |            | 8.0.272-zulu
               |     | 8.0.272.fx   | zulu    |            | 8.0.272.fx-zulu
               |     | 7.0.282      | zulu    |            | 7.0.282-zulu
               |     | 6.0.119      | zulu    |            | 6.0.119-zulu
 BellSoft      |     | 15.0.1.fx    | librca  |            | 15.0.1.fx-librca
               |     | 15.0.1       | librca  |            | 15.0.1-librca
               |     | 14.0.2.fx    | librca  |            | 14.0.2.fx-librca
               |     | 14.0.2       | librca  |            | 14.0.2-librca
               |     | 13.0.2.fx    | librca  |            | 13.0.2.fx-librca
               |     | 13.0.2       | librca  |            | 13.0.2-librca
               |     | 12.0.2       | librca  |            | 12.0.2-librca
               |     | 11.0.9.fx    | librca  |            | 11.0.9.fx-librca
               |     | 11.0.9       | librca  |            | 11.0.9-librca
               |     | 8.0.272.fx   | librca  |            | 8.0.272.fx-librca
               |     | 8.0.272      | librca  |            | 8.0.272-librca
               |     | 8.0.265.fx   | librca  |            | 8.0.265.fx-librca
 GraalVM       |     | 20.2.0.r11   | grl     |            | 20.2.0.r11-grl
               |     | 20.2.0.r8    | grl     |            | 20.2.0.r8-grl
               |     | 20.1.0.r11   | grl     |            | 20.1.0.r11-grl
               |     | 20.1.0.r8    | grl     |            | 20.1.0.r8-grl
               |     | 20.0.0.r11   | grl     |            | 20.0.0.r11-grl
               |     | 20.0.0.r8    | grl     |            | 20.0.0.r8-grl
               |     | 19.3.1.r11   | grl     |            | 19.3.1.r11-grl
               |     | 19.3.1.r8    | grl     |            | 19.3.1.r8-grl
 Java.net      |     | 16.ea.21     | open    |            | 16.ea.21-open
               |     | 16.ea.6.lm   | open    |            | 16.ea.6.lm-open
               |     | 16.ea.2.pma  | open    |            | 16.ea.2.pma-open
               |     | 15.0.1       | open    |            | 15.0.1-open
               |     | 14.0.2       | open    |            | 14.0.2-open
               |     | 13.0.2       | open    |            | 13.0.2-open
               |     | 12.0.2       | open    |            | 12.0.2-open
               |     | 11.0.2       | open    |            | 11.0.2-open
               |     | 10.0.2       | open    |            | 10.0.2-open
               |     | 9.0.4        | open    |            | 9.0.4-open
               |     | 8.0.265      | open    |            | 8.0.265-open
 SAP           |     | 14.0.2       | sapmchn |            | 14.0.2-sapmchn
               |     | 13.0.2       | sapmchn |            | 13.0.2-sapmchn
               |     | 12.0.2       | sapmchn |            | 12.0.2-sapmchn
               |     | 11.0.9       | sapmchn |            | 11.0.9-sapmchn
================================================================================
Use the Identifier for installation:

    $ sdk install java 11.0.3.hs-adpt
================================================================================
~ ❯❯❯ sdk install java 15.0.1.hs-adpt

Downloading: java 15.0.1.hs-adpt

In progress...

####################################################################################################################### 100.0%####################################################################################################################### 100.0%

Repackaging Java 15.0.1.hs-adpt...

Done repackaging...

Installing: java 15.0.1.hs-adpt
Done installing!


Setting java 15.0.1.hs-adpt as default.
~ ❯❯❯ sdk install sbt

Downloading: sbt 1.4.1

In progress...

####################################################################################################################### 100.0%####################################################################################################################### 100.0%

Installing: sbt 1.4.1
Done installing!


Setting sbt 1.4.1 as default.
~ ❯❯❯ sdk list scala
================================================================================
Available Scala Versions
================================================================================
     2.13.3              2.12.1
     2.13.2              2.12.0
     2.13.1              2.11.12
     2.13.0              2.11.11
     2.12.12             2.11.8
     2.12.11             2.11.7
     2.12.10             2.11.6
     2.12.9              2.11.5
     2.12.8              2.11.4
     2.12.7              2.11.3
     2.12.6              2.11.2
     2.12.5              2.11.1
     2.12.4              2.11.0
     2.12.3
     2.12.2

================================================================================
+ - local version
* - installed
> - currently in use
================================================================================
~ ❯❯❯ scala
-bash: scala: command not found
~ ❯❯❯ sdk install scala 2.13.3

Downloading: scala 2.13.3

In progress...

####################################################################################################################### 100.0%

Installing: scala 2.13.3
Done installing!


Setting scala 2.13.3 as default.
~ ❯❯❯ sca
scala       scalac      scaladoc    scalap      scan-build  scan-view
~ ❯❯❯ scala
Welcome to Scala 2.13.3 (OpenJDK 64-Bit Server VM, Java 15.0.1).
Type in expressions for evaluation. Or try :help.

scala>
```

