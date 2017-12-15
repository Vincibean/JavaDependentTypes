# Dependent Types with Java Compiled Protobufs 
When Protocol Buffers (Protobufs) are compiled against Java, there's no strong relationship between the type of a 
Generated Message and the type of the relevant builder. Apparently, this is because Java's type system isn't strong 
enough to support dependent types.

This POC aims to show how it is possible to gain dependent types using Java compiled Protobufs, Scala,
[structural types](https://twitter.github.io/scala_school/advanced-types.html#structural),
the ["Typeclass pattern"](http://danielwestheide.com/blog/2013/02/06/the-neophytes-guide-to-scala-part-12-type-classes.html),
and the ["Aux pattern"](https://gigiigig.github.io/posts/2015/09/13/aux-pattern.html).

