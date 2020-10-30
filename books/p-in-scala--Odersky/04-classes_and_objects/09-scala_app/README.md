### According to the book

```bash
~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ls
ChecksumCalculator.scala  Summer.scala
~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ scalac ChecksumCalculator.scala Summer.scala
warning: 2 deprecations (since 2.13.0); re-run with -deprecation for details
1 warning
~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ll
total 32
drwxr-xr-x 3 phunc20 wheel 4096 Oct 30 10:20  ..
-rw-r--r-- 1 phunc20 wheel  164 Oct 30 10:21  Summer.scala
-rw-r--r-- 1 phunc20 wheel  288 Oct 30 10:25  ChecksumCalculator.scala
-rw-r--r-- 1 phunc20 wheel 1502 Oct 30 10:25  ChecksumCalculator.class
-rw-r--r-- 1 phunc20 wheel 2398 Oct 30 10:25 'ChecksumCalculator$.class'
-rw-r--r-- 1 phunc20 wheel  620 Oct 30 10:25  Summer.class
-rw-r--r-- 1 phunc20 wheel 2472 Oct 30 10:25 'Summer$.class'
drwxr-xr-x 2 phunc20 wheel 4096 Oct 30 10:25  .
~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ scala Summer of love
of: -213
love: -182
```

### Diff from the book
- What if we change the order in the `scalac` command? **Ans**: It will *still work the same*.
    ```bash
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ mv *.class ~/corbeille/
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ls
    ChecksumCalculator.scala  README.md  Summer.scala
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ scalac Summer.scala ChecksumCalculator.scala
    warning: 2 deprecations (since 2.13.0); re-run with -deprecation for details
    1 warning
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ls
    'ChecksumCalculator$.class'   ChecksumCalculator.scala  'Summer$.class'   Summer.scala
     ChecksumCalculator.class     README.md                  Summer.class
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ scala Summer of love
    of: -213
    love: -182
    ```
- re-run w/ the `-deprecation` option: Just warning about the `: Unit =` thing now must be specified.
    ```bash
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ mv *.class ~/corbeille/
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ls
    ChecksumCalculator.scala  README.md  Summer.scala
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ scalac -deprecation ChecksumCalculator.scala Summer.scala
    ChecksumCalculator.scala:3: warning: procedure syntax is deprecated: instead, add `: Unit =` to explicitly declare `add`'s return type
      def add(b: Byte) { sum += b }
                       ^
    Summer.scala:3: warning: procedure syntax is deprecated: instead, add `: Unit =` to explicitly declare `main`'s return type
      def main(args: Array[String]) {
                                    ^
    2 warnings
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ls
    'ChecksumCalculator$.class'   ChecksumCalculator.scala  'Summer$.class'   Summer.scala
     ChecksumCalculator.class     README.md                  Summer.class
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ scala Summer of love
    of: -213
    love: -182
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ mv *.class ~/corbeille/
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯ ls
    ChecksumCalculator.scala  README.md  Summer.scala
    ~/.../p-in-scala--Odersky/04-classes_and_objects/09-scala_app ❯❯❯
    ```
