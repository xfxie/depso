#Optimization examples
java -jar ../dist/depso.jar Problem=problem.constrained.Michalewicz_G1 N=70 T=2000 Tout=100
java -jar ../dist/depso.jar Problem=problem.constrained.Michalewicz_G3 N=70 T=2000 Tout=100 isACR=true
java -jar ../dist/depso.jar Problem=problem.unconstrained.GoldsteinPrice N=10 T=100 Tout=10 

#Simulation examples
#Params: [Function] [Input Variables (Separated by ",")]
java -cp ../dist/depso.jar problem.Simulator problem.constrained.Michalewicz_G1 "1,1,1,1,1,1,1,1,1,3,3,3,1"
