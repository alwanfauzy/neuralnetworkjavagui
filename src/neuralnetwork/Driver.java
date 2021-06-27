/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import java.util.List;

/**
 *
 * @author Alwan Fauzi
 */

public class Driver {
	
	static double [][] X= {
			{0,0},
			{1,0},
			{0,1},
			{1,1}
	};
	static double [][] Y= {
			{0},{1},{0},{1}
	};

	public static void main(String[] args) {
		
		NeuralNetwork nn = new NeuralNetwork(2,10,1);
		
		
		List<Double>output;
		
		nn.fit(X, Y, 50000);
		double [][] input = {
				{0,0},{0,1},{1,0},{1,1}	
		};
		for(double d[]:input)
		{
			output = nn.predict(d);
			System.out.println(output.toString());
		}		

	}
}