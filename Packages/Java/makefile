run: Dave.class
	java Dave

Dave.class: Dave.java Person.class
	javac Dave.java

Person.class: Person.java
	javac Person.java

clean:
	rm *.class

save:
	git add *
	git commit *
	git push origin main

cleanSave:
	rm *.class
	git add *
	git commit *
	git push origin main