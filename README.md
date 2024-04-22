#This is project is about Java performance Tuning and Memory Management

###Below are list of compiler flags that used:

```
-XX: +/-(OptionName)

Here dash XX means this is an advanced option. Then there's a colon, then we have plus or a minus, which indicates if we want the option to be switch on or off and then the option name.
```

```
1) -XX:+PrintCompilation

To find what compilation is happen at JVM.

	- The "n" in the column mean "Native Method"
	- The "s" in the column mean it's a "Synchronized Method"
	- The "!" in the column mean there's some exception handling going on
	- The "%" in the column mean that the code has been natively complied and is now running in a special part of memory called the code cache. It also means that the method is now running in the most optimal way possible.
The number between 0 to 4 in column where 0 means no compilation has taken place where as number 1 to 4 mean that a progressively deeper level of compilation has happened.
```

```
2) -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation

To write log file.
To run this on a remote machine we need a flag "log compilation". For this we need another flag first called "Diagnostic Options" 
```

```
3) -XX:+PrintCodeCache

To find the size of the code cache
```

```
4) -XX:ReservedCodeCacheSize=28m

To change the code cache size
Each of this values can be provided in either bytes, kilobytes(k/K) or megabytes(m/M)
```