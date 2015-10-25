#!/bin/bash
rm -f b/b/*.class
a/BUILD && \
dotc -classpath a:guava-16.0.1.jar:jsr305-2.0.1.jar -d b b/b/*.scala
