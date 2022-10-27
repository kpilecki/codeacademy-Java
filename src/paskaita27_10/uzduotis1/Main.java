package paskaita27_10.uzduotis1;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> suma = (a, b) ->  a + b;
		BiFunction<Integer,Integer,Integer> skirtumas = (a, b) -> a - b;
		BiFunction<Integer,Integer,Integer> daugyba = (a, b) -> a * b;
		BiFunction<Integer,Integer,Integer> dalyba = (a, b) -> a / b;
		
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println( add.apply( 8, 4 ));
		
		IntBinaryOperator multiply = (a, b) -> a * b;
		System.out.println( multiply.applyAsInt( 8, 4 ));
		
		useLambda( suma );
		useLambda( skirtumas );
		useLambda( daugyba );
		useLambda( dalyba );
		useLambda( suma );
		
		
		
	}
	
	public static void useLambda( BiFunction<Integer,Integer,Integer> function ) {
		System.out.println( function.apply( 8, 4 ));
	}

}
