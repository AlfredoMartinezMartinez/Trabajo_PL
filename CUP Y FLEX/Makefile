all: java
	javac *.java

java:
	jflex *.flex
	cup *.cup

clean:
	$(RM) *.class
	$(RM) parser.java sym.java Yylex.java
	$(RM) *~
