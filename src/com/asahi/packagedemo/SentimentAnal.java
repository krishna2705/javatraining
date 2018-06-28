package com.asahi.packagedemo;

import java.util.Arrays;

class SentimentAnal {

	// Tip: labeled continue can be used + convert review to lower-case
	public static int[] detectProsAndCons(String review, String[][] featureSet,
		String[] posOpinionWords, String[] negOpinionWords) {
		int[] featureOpinions = new int[featureSet.length];
		review = review.toLowerCase();

		nextFeature: for (int i = 0; i < featureSet.length; i++) {
			String[] features = featureSet[i];

			for (String feature : features) {
				if (review.contains(feature)) {
					int opinion = getOpinionOnFeature(review, feature,
							posOpinionWords, negOpinionWords);

					if (opinion != 0) {
						// Opinion found. Record opinion and move onto next
						// feature
						featureOpinions[i] = opinion;
						continue nextFeature;
					}
				}
			}
		}

		return featureOpinions;
	}

	// First invoke checkForWasPhrasePattern and
	// if it cannot find an opinion only then invoke checkForOpinionFirstPattern
	private static int getOpinionOnFeature(String review, String feature,
			String[] posOpinionWords, String[] negOpinionWords) {
		int opinion = checkForWasPhrasePattern(review, feature,
				posOpinionWords, negOpinionWords);

		if (opinion == 0) {
			opinion = checkForOpinionFirstPattern(review, feature,
					posOpinionWords, negOpinionWords);
		}
		return opinion;
	}

	private static int checkForWasPhrasePattern(String review, String feature,
			String[] posOpinionWords, String[] negOpinionWords) {
		int opinion = 0;
		String pattern = feature + " was ";
		// System.out.println(review.startsWith("was"));
		// System.out.println("feature : "+feature);
		if (review.contains(pattern)) {
			// int ind = review.indexOf(pattern)+ pattern.length();
			// System.out.println(review.substring(ind,review.indexOf(" ",
			// ind)));
			// System.out.println(review.substring(54));
			int posOp = getPosOp(review, posOpinionWords, pattern);
			int negOp = -1;
			if (posOp == 1)
				return 1;
			else
				negOp = getNegOp(review, negOpinionWords, pattern);

			if (negOp == -1)
				return -1;
			else
				return 0;
		}

		// return 0;
		// your code

		return opinion;
	}

	private static int getPosOp(String review, String[] posOpinionWords,
			String pattern) {

		for (int i = 0; i < posOpinionWords.length; i++) {
			String pattrn = pattern;
			pattrn = pattrn + posOpinionWords[i];

			if (review.contains(pattrn)) {

				return 1;
			}
			pattrn = "";

		}
		return 0;

	}

	private static int getNegOp(String review, String[] negOpinionWords,
			String pattern) {

		for (int i = 0; i < negOpinionWords.length; i++) {
			String pattrn = pattern;
			pattrn = pattrn + negOpinionWords[i];

			if (review.contains(pattrn)) {
				pattrn = "";
				return 1;
			} else {
				pattrn = "";
				return 0;
			}

		}
		return 0;

	}

	private static int checkForOpinionFirstPattern(String review,
			String feature, String[] posOpinionWords, String[] negOpinionWords) {
		// Extract sentences as feature might appear multiple times.
		// split() takes a regular expression and "." is a special character
		// for regular expression. So, escape it to make it work!!
		String[] sentences = review.split("\\.");
		// System.out.println("sent= "+sentences.length);
		int opinion = 0;
		// String pattern = "";
		String pattern = " " + feature;
		for (int i = 0; i < sentences.length; i++) {
			// System.out.println(sentences[i]);
			for (int j = 0; j < posOpinionWords.length; j++) {
				// pattern = posOpinionWords[j]+pattern;
				// System.out.println("sent cont: "+sentences[i].contains(pattern));
				if (sentences[i].contains(posOpinionWords[j] + pattern)) {
					// opinion = 1;
					return 1;
				}

				// pattern="";
			}

			for (int j = 0; j < negOpinionWords.length; j++) {
				// pattern = posOpinionWords[j]+pattern;
				// System.out.println("sent cont: "+sentences[i].contains(pattern));
				if (sentences[i].contains(negOpinionWords[j] + pattern)) {
					// opinion = 1;
					return -1;
				}

				// pattern="";
			}
		}
		// your code for processing each sentence. You can return if opinion is
		// found in a sentence (no need to process subsequent ones)

		return 0;
	}

	public static void main(String[] args) {
		String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";

		// String review =
		// "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";

		String[][] featureSet = {
				{ "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" },
				{ "food" },
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender",
						"staff", "server" } };
		String[] posOpinionWords = { "good", "fantastic", "friendly", "great",
				"excellent", "amazing", "awesome", "delicious" };
		String[] negOpinionWords = { "slow", "bad", "horrible", "awful",
				"unprofessional", "poor" };

		int[] featureOpinions = detectProsAndCons(review, featureSet,
				posOpinionWords, negOpinionWords);
		System.out.println("Opinions on Features: "
				+ Arrays.toString(featureOpinions));
	}
}
