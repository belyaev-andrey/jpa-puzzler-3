# JPA Puzzle 3 - Entity Graph

Here we show how entity graphs work. If we try to print a pet's collar, you'll get `LazyInitException`. To avoid this, 
we need to either add `Collar` to the entity graph or use `EntityGraphType.LOAD` in the repository.