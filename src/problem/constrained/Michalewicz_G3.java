/**
 * Description: Benchmark function (Michalewicz's G3).
 * X*(Optimal point):
 * X1~X10: 1/sqrt(n)=0.31622776601683794 (as n=10)
 * Y*(Optimal value)
 * Y1=1
 * 
 * f* (epsilon=1E-4) = 1.00050
 *
 * @ Author        Create/Modi     Note
 * Xiaofeng Xie    Dec 28, 2001
 * Xiaofeng Xie    Mar 02, 2003
 * Xiaofeng Xie    May 11, 2004
 *
 * @URL: http://www.wiomax.com/nop/
 * @Email: xie@wiomax.com, xfxie@alumni.cmu.edu
 * 
 * @Version 1.0
 * @Since MAOS-S1.0
 *
 * @References:
 * [1] Koziel S, Michalewicz Z. Evolutionary algorithms, homomorphous
 * mappings, and constrained parameter optimization. Evolutionary
 * Computation, 1999, 7: 19-44
 * [2] X F Xie, W J Zhang. SWAF: Swarm algorithm framework for numerical 
 * optimization. Genetic and Evolutionary Computation Conference (GECCO), 
 * Seattle, WA, USA, 2004: 238-250
 */

package problem.constrained;

import problem.ProblemEncoder;

public class Michalewicz_G3 extends ProblemEncoder {
  static final int NX = 10;
  static final int NY = 2;
  private double epsilon = 1E-4; //tolerance value
  public Michalewicz_G3() throws Exception {
    super(NX, NY);
    for(int i=0; i<NX; i++) {
      setDefaultXAt(i, 0, 1);
    }

    setDefaultYAt(0, MAXBOUND, MAXBOUND);
    setDefaultYAt(1, -epsilon, epsilon); //use the range [-epsilon, epsilon] as the approximation of an equality constraint
  }

  protected double calcTargetAt(int index, double[] VX) {
    double value = 0;
    switch(index) {
      case 0:
        value = Math.pow(Math.sqrt(NX),NX);
        for (int j=0; j<NX; j++) {
          value *= VX[j];
        }
        break;
      case 1:
        value = -1;
        for (int j=0; j<NX; j++) {
          value += Math.pow(VX[j],2);
        }
        break;
    default:
      return Double.NaN;
    }
    return value;
  }
}
