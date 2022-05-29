package com.java.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Different_Typesof_ArrayList_Iteration {

	public static void main(String[] args) {

		ArrayList<String> tvMovies = new ArrayList<String>();
		tvMovies.add("Game of Thrones");
		tvMovies.add("Rocky Series");
		tvMovies.add("Fast and Furious");
		tvMovies.add("Spy Kids");
		tvMovies.add("X-Men Series");

		// 1.using java 8 with for each loop and lambda expression:

		System.out.println("-----print using for each with lambda in java 8-----");
		tvMovies.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("----print using Iterator----");

		// 2.using Iterator:
		Iterator<String> it = tvMovies.iterator();

		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		// 3.using iterator and java 8 lambda and forEachRemaning() method
		System.out.println("----print using iterator and java 8 lambda and forEachRemaining() method----");

		Iterator<String> iter = tvMovies.iterator();
		iter.forEachRemaining(show -> {
			System.out.println(show);
		});

		// 4.using for each loop:
		System.out.println("----print using for each loopl----");
		for (String show : tvMovies) {
			System.out.println(show);
		}

		// 5.using for loop with order/index:
		System.out.println("----print using for loop with order/index----");
		for (int i = 0; i < tvMovies.size(); i++) {
			System.out.println(tvMovies.get(i));
		}

		// 6.using a listIterator() to traverse in both the directions
		ListIterator<String> tvSeriesListIterator = tvMovies.listIterator();
		System.out.println("----print using ListIterator() to Forward traverse in directions----");
		
		while (tvSeriesListIterator.hasNext()) {
			String show = tvSeriesListIterator.next();
			System.out.println(show);
		}
		
		System.out.println("----print using ListIterator() to reverse traverse in directions----");
		//ListIterator<String> tvSeriesListIterator = tvMovies.listIterator(tvMovies.size());
		while (tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
		
		

	}

}