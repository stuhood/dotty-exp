Because the build for module b does not providing the transitive dependencies 
of module a to the compiler, it receives a head-of-empty-list exception during
compilation.

Reproduce with:

    ./b/run

