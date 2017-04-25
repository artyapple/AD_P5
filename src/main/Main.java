package main;

import java.util.ArrayList;
import java.util.List;

import element.Element;
import pivot.IPivotElement;
import pivot.PivotFirst;
import pivot.PivotMedian;
import pivot.PivotRandom;
import sort.QuickSort;
import sort.SortingAlgorithm;

public class Main {

	public static void main(String[] args) {
		ComplexityAnalysis a = new ComplexityAnalysis();
		a.avgCase();
		//a.bestCaseMedianPivot();
		//a.worstCaseFirstPivot();
	}
}
