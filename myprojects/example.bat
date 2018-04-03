#Optimization examples
java -jar ../dist/depso.jar DEPSO Problem=problem.constrained.Michalewicz_G1 N=70 T=2000 Tout=100
java -jar ../dist/depso.jar DEPSO Problem=problem.constrained.Michalewicz_G3 isACR=true  N=70 T=2000 Tout=100
java -jar ../dist/depso.jar DEPSO T=100 N=10 Tout=10 Problem=problem.unconstrained.GoldsteinPrice 

#Simulation examples
#Params: [Function] [Input Parameters (Separated by ",")]
java -cp ../dist/depso.jar problem.Simulator problem.constrained.Michalewicz_G1 "1,1,1,1,1,1,1,1,1,3,3,3,1"
