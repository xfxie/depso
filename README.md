DEPSO
========

DEPSO, or called DEPS, is an optimization algorithm hybridizing the advantages of Particle Swarm Optimization (PSO) and Differential Evolution (DE). It can be incorporated into [cooperative group optimization](http://www.wiomax.com/optimization) (CGO) system.

The [DEPSO paper](http://www.wiomax.com/team/xie/paper/SMCC03.pdf) has been [cited](https://scholar.google.com/scholar?cites=14983093978441487870) over 400 times with various applications. DEPSO was also implemented (by Sun Microsystems Inc.) into [NLPSolver](https://wiki.openoffice.org/wiki/NLPSolver) (Solver for Nonlinear Programming), an extension of Calc in Apache OpenOffice.

Problem to be Solved
--------------------
It solves (constrained) numerical optimization problem (NOP) as

<img src="image/nop.png" width="50%" />

where f(x) is the objective function and each g(x) is a constraint function to be satisfied, and _c_ and _d_ are constants. All the functions can be nonlinear and nonsmooth.

General information
-------------------

Portal: http://www.wiomax.com/depso
E-MAIL: Xiao-Feng Xie <xie@wiomax.com>

Version History
-------------------

Current: The mini Series V1.00.03 (Java) with the DEPSO implementation

Quick start
-----------

- Execute: Enter the directory "myprojects", then run the file "examples.bat".

- Compile: Type "ant" to build, and the output file will be dist/depso.jar. 

- See src/problem for examples of constrain and unconstrained problem instances.

License description
-------------------

See the [Creative Commons Non-Commercial License 3.0](https://creativecommons.org/licenses/by-nc/3.0/us/) for more details.

Please acknowledge the author(s) if you use this code in any way.

