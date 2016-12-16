How to run these example programs with IntelliJ IDEA at 2016-12-16?

(with dumb way)

(see the [smart way](README))

I created an IntelliJ IDEA project on `ThreadsLocks/`,

dragged every `pom.xml` to "Maven Projects" tool window (select them all and drag all at once),

and used IDEA's `Run - Run...` (alt+shift+F10 in Windows) to run each program (instead of running them via Maven).

---

`D:\Users\admin\Dev\seven-concurrency-models-in-seven-weeks\ThreadsLocks\Counting\target\classes\com\paulbutcher>javap -c Counting$1Counter > Counting$1Counter.txt`

---

可用 C:\Program Files (x86)\JetBrains\IntelliJ IDEA 2016.2.2\plugins\maven\lib\maven3\bin

但用自己下载的 D:\Softwares\apache-maven-3.3.9\bin

会报错 

Exception in thread "main" java.lang.UnsupportedClassVersionError: org/apache/maven/cli/MavenCli : Unsupported major.minor version 51.0
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClassCond(ClassLoader.java:631)
        at java.lang.ClassLoader.defineClass(ClassLoader.java:615)
        at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
        at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
        at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
        at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClassFromSelf(ClassRealm.java:401)
        at org.codehaus.plexus.classworlds.strategy.SelfFirstStrategy.loadClass(SelfFirstStrategy.java:42)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.unsynchronizedLoadClass(ClassRealm.java:271)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass(ClassRealm.java:254)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass(ClassRealm.java:239)
        at org.codehaus.plexus.classworlds.launcher.Launcher.getMainClass(Launcher.java:144)
        at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:266)
        at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
        at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
        at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)

D:\Users\admin\Dev\seven-concurrency-models-in-seven-weeks\ThreadsLocks\Counting>java -version
java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)


为啥呢？maven3最新版有bug？不管了 http://stackoverflow.com/questions/35595683/how-to-resolve-unsupported-major-minor-version-51-0-error-when-trying-to-run-mav

现在呢，用户变量path里这两个bin/都有，只是能用的那个排名靠前。会有坑么？怕怕

---
2016-12-16 15:48:05

"C:\Program Files (x86)\JetBrains\IntelliJ IDEA 2016.2.2\plugins\maven\lib\maven3\bin\mvn" compile

下载两分钟！无物可编译（

Downloaded: http://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.8.1/
plexus-compiler-api-1.8.1.jar (20 KB at 38.9 KB/sec)
[INFO] Nothing to compile - all classes are up to date
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2:36.539s
[INFO] Finished at: Fri Dec 16 15:46:33 CST 2016
[INFO] Final Memory: 4M/243M
[INFO] ------------------------------------------------------------------------
D:\Users\admin\Dev\seven-concurrency-models-in-seven-weeks\ThreadsLocks\Counting>

啊 真特么离题万里

---

IDEA 里 execute maven goal 可以 exec:java
……但是没感到优越性！还是用IDEA内置的make，run吧……

