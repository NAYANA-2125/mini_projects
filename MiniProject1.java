package com.gqt.core_java.mini_project;

/**
 * @author nayana
 * @category Mini Project
 * Quiz Application 
 *
 */
import java.util.Scanner;

class Quiz {
	String name;
	int age;
	String city;
	String state;
	int option;
	String opt;
	static int lifeline;
	static int aud_phn;
	static int ff;
	boolean isEliminated = false;

	static {
		lifeline = 2;
		aud_phn = 1;
		ff = 1;
	}

	Scanner sc = new Scanner(System.in);
	final String BRIGHT_PINK = "\u001B[38;5;213m";
	final String DARK_VIOLET = "\u001B[38;5;57m";
	final String BRIGHT_YELLOW_BG = "\u001B[103m";
	final String MAGENTA = "\u001B[35m";
	final String BRIGHT_RED = "\u001B[91m";
	final String BRIGHT_PURPLE = "\u001B[95m";
	final String PINK_256 = "\u001B[38;5;201m";
	final String GREEN = "\u001B[32m";
	final String BLUE = "\u001B[34m";
	final String Yellow = "\u001B[33m";
	final String RED = "\u001B[31m";
	final String ORANGE_BOLD = "\u001B[1m\u001B[38;5;202m";
	final String ORANGE_BG = "\u001B[48;5;208m";
	final String BROWN = "\u001B[38;5;94m";
	final String SADDLE_BROWN = "\u001B[38;5;130m";
	final String CHOCOLATE = "\u001B[38;5;136m";
	final String PERU = "\u001B[38;5;137m";
	final String RESET = "\u001B[0m";

	// Collecting the data
	void collectData() {
		System.out.println(MAGENTA + "Enter Your Name:");
		name = sc.next();
		System.out.println("Enter Your Age:");
		age = sc.nextInt();
		System.out.println("Enter Your City:");
		city = sc.next();
		System.out.println("Enter Your State:");
		state = sc.next();
		System.out.println(GREEN + "Thank You!!" + name + RESET);
		sc.nextLine();
	}

	// Displaying the reward tree
	void showMoneyTree() {
		System.out.println(BRIGHT_YELLOW_BG + "MONEY TREE" + RESET);
		System.out.println("---------------------------------");
		System.out.println(DARK_VIOLET + "Q1  1,000");
		System.out.println("Q2  2,000");
		System.out.println("Q3  5,000");
		System.out.println("Q4  10,000");
		System.out.println("Q5  20,000");
		System.out.println("Q6  40,000");
		System.out.println("Q7  80,000");
		System.out.println("Q8  2,00,000");
		System.out.println("Q9  3,00,000");
		System.out.println("Q10 5,00,000" + RESET);
		System.out.println("---------------------------------");
	}

	// Terminate and display details
	void terminate() {
		isEliminated = true;
		System.out.println(Yellow + "Details:");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("City:" + city);
		System.out.println("State:" + state);
		System.out.println(GREEN + "Thank You!!" + name + RESET);
		return;

	}

	// Question-1
	void question1() {
		System.out.println(PINK_256 + name + " Here's is your 1st question:" + RESET);
		System.out.println(ORANGE_BOLD + "Q1. Who developed java?" + RESET);
		System.out.println(CHOCOLATE + "1. Ken Thompson");
		System.out.println("2. Green Team");
		System.out.println("3. Dennis Ritchie");
		System.out.println("4. Martin Richards");
		System.out.println("5. Use Lifeline");
		System.out.println(Yellow + "Reward for this question is: 1,000" + RESET);

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 2) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 1,000.");
			System.out.println("Get Ready for the next question.");

		} else if (option == 5) {
			if (lifeline > 0 && ff==1||aud_phn==1) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("Auidence phone");
				if (ff == 1)
					System.out.println("50-50");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					if (aud_phn == 1) {
						aud_phn = 0;
						lifeline--;
						System.out.println(BLUE
								+ "1. Ken Thompson(30%)\n2. Green Team(70%)\n3. Dennis Ritchie(35%)\n4. Martin Richards(30%)"
								+ RESET);
						option = sc.nextInt();

						if (option == 2) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 1,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 0");
							terminate();
						}
					} else {
						System.out.println(RED + "No lifeline available ,already used!" + RESET);

						System.out.println("Select the correct option without lifeline:");
						option = sc.nextInt();
						if (option == 2) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 1,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 0");
							terminate();
						}
					}
				} else if (opt.equals("ff")) {
					if (ff == 1) {
						ff = 0;
						lifeline--;
						System.out.println("2. Green Team\n 4. Martin Richards");
						option = sc.nextInt();

						if (option == 2) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 1,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 0");
							terminate();
						}
					} else {
						System.out.println(RED + "No lifeline available ,already used!" + RESET);

						System.out.println("Select the correct option without lifeline:");
						option = sc.nextInt();
						if (option == 2) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 1,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 0");
							terminate();
						}
					}
				} else {
					System.out.println(RED + "Invalid lifeline option!" + RESET);

					System.out.println("Select the correct option without lifeline:");
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 1,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 0");
						terminate();
					}
				}

			} else {
				System.out.println(RED + "No lifeline available!" + RESET);

				System.out.println("Select the correct option without lifeline:");
				option = sc.nextInt();
				if (option == 2) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 1,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
					System.out.println("Reward is: 0");
					terminate();
				}
			}
		} else if (option == 1 || option == 3 || option == 4) {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
			System.out.println("Reward is: 0");
			terminate();
		}
	}

	// Question-2
	void question2() {
		System.out.println(PINK_256 + name + " Here's is your next question");
		System.out.println(ORANGE_BOLD + "Q2. Which among the following is true about advantages of RAM?" + RESET);
		System.out.println(BROWN + "1. Fast");
		System.out.println("2. Slow");
		System.out.println("3. Costly");
		System.out.println("4. Volatile");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 2,000" + RESET);

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 1) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 2,000.");
			System.out.println("Get Ready for the next question.");

		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("aud_phn");
				if (ff == 1)
					System.out.println("ff");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					if (aud_phn == 1) {
						aud_phn = 0;
						lifeline--;
						System.out
						.println(BLUE + "1. Fast(30%)\n2. Slow(70%)\n3. Costly(35%)\n4. Volatile(30%)" + RESET);
						option = sc.nextInt();

						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 2,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 1,000");
							terminate();
						}
					} else {
						System.out.println(RED + "No lifeline available ,already used!" + RESET);
						System.out.println("Please select the correct option without lifeline:");
						option = sc.nextInt();
						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 2,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 1,000");
							terminate();
						}
					}
				} else if (opt.equals("ff")) {
					if (ff == 1) {
						ff = 0;
						lifeline--;
						System.out.println("1. Fast\n2. Slow");
						option = sc.nextInt();

						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 2,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 1,000");
							terminate();
						}
					} else {
						System.out.println(RED + "No lifeline available ,already used!" + RESET);
						System.out.println("Please select the correct option without lifeline:");
						option = sc.nextInt();
						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 2,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 1,000");
							terminate();
						}
					}
				} else {
					System.out.println(RED + "Invalid lifeline option!" + RESET);
					System.out.println("Please select the correct option without lifeline:");
					option = sc.nextInt();
					if (option == 1) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 2,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 1,000");
						terminate();
					}
				}
			} else {
				System.out.println(RED + "No lifeline available!" + RESET);
				System.out.println("Please select the correct option without lifeline:");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 2,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
					System.out.println("Reward is: 1,000");
					terminate();
				}
			}
		} else if (option == 2 || option == 3 || option == 4) {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
			System.out.println("Reward is: 1,000");
			terminate();
		}
	}

	// Question-3
	void question3() {
		System.out.println(PINK_256 + name + " Here's is your next question");
		System.out.println(ORANGE_BOLD + "Q3. JVM Full Form _________" + RESET);
		System.out.println(BROWN + "1. Java Virtual Machine");
		System.out.println("2. Java Virtual Mechanism");
		System.out.println("3. Java Volatile Machine");
		System.out.println("4. Java Volatile Mechanism");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 5,000");
		System.out.println("Enter your choice:");
		option = sc.nextInt();

		if (option == 1) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 5,000.");
			System.out.println("Get Ready for the next question.");

		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("aud_phn");
				if (ff == 1)
					System.out.println("ff");
				opt = sc.next();

				if (opt.equals("aud_phn")) {
					if (aud_phn == 1) {
						aud_phn = 0;
						lifeline--;
						System.out.println(BLUE
								+ "1. Java Virtual Machine(50%)\n2. Java Virtual Mechanism(50%)\n3. Java Volatile Machine(25%)\n4. Java Volatile Mechanism(30%)"
								+ RESET);
						option = sc.nextInt();
						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println("You have won 5,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println("You are eliminated from quiz.");
							System.out.println("Reward is: 2,000");
							terminate();
						}
					} else {
						System.out.println(RED + "No lifeline available ,already used!" + RESET);
						System.out.println("Please select the correct option without lifeline:");
						option = sc.nextInt();
						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 5,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 2,000");
							terminate();
						}
					}
				} else if (opt.equals("ff")) {
					if (ff == 1) {
						ff = 0;
						lifeline--;
						System.out.println("1. Java Virtual Machine\n2. Java Virtual Mechanism");
						option = sc.nextInt();
						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 5,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 2,000");
							terminate();
						}
					} else {
						System.out.println(RED + "No lifeline available ,already used!" + RESET);
						System.out.println("Please select the correct option without lifeline:");
						option = sc.nextInt();
						if (option == 1) {
							System.out.println(GREEN + name + " Your answer is correct" + RESET);
							System.out.println(BRIGHT_PINK + "You have won 5,000.");
							System.out.println("Get Ready for the next question.");
						} else {
							System.out.println(RED + name + " Your answer is wrong" + RESET);
							System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
							System.out.println("Reward is: 2,000");
							terminate();
						}
					}
				} else {
					System.out.println(RED + "Invalid lifeline option!" + RESET);
					System.out.println("Please select the correct option without lifeline:");
					option = sc.nextInt();
					if (option == 1) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 5,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 2,000");
						terminate();
					}
				}
			} else {
				System.out.println(RED + "No lifeline available!" + RESET);
				System.out.println("Please select the correct option without lifeline:");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 5,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
					System.out.println("Reward is: 2,000");
					terminate();
				}
			}
		} else if (option == 2 || option == 3 || option == 4) {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
			System.out.println("Reward is: 2,000");
			terminate();
		}
	}

	// Question-4
	void question4() {
		System.out.println(PINK_256 + name + " Here's your next question");
		System.out.println(ORANGE_BOLD + "Q4. Which among the following is true?" + RESET);
		System.out.println(BROWN + "1. int 1a=20;");
		System.out.println("2. int a#b=40;");
		System.out.println("3. Both 1 & 2 are true");
		System.out.println("4. Both 1 & 2 are false");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 10,000");
		System.out.println("Enter your choice:");
		option = sc.nextInt();

		if (option == 4) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 10,000.");
			System.out.println("Get Ready for the next question.");
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				System.out.println("Available Lifelines:");
				if (aud_phn == 1)
					System.out.println("aud_phn");
				if (ff == 1)
					System.out.println("ff");

				opt = sc.next();

				if (opt.equals("aud_phn") && aud_phn == 1) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE + "1. int 1a=20; (25%)" + RESET);
					System.out.println(BLUE + "2. int a#b=40; (55%)" + RESET);
					System.out.println(BLUE + "3. Both 1 & 2 are true (35%)" + RESET);
					System.out.println(BLUE + "4. Both 1 & 2 are false (30%)" + RESET);
					option = sc.nextInt();
					if (option == 4) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 10,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 5,000");
						terminate();
					}
				} else if (opt.equals("ff") && ff == 1) {
					ff = 0;
					lifeline--;
					System.out.println("1. int a#b=40;");
					System.out.println("2. Both 1 & 2 are false");
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 10,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 5,000");
						terminate();
					}
				} else {
					System.out.println(RED + "Invalid or already used lifeline!" + RESET);
					System.out.println("Please choose from options 1 to 4:");
					option = sc.nextInt();
					if (option == 4) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 10,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 5,000");
						terminate();
					}
				}
			} else {
				System.out.println(RED + "No lifeline available!" + RESET);
				System.out.println("Please choose from options 1 to 4:");
				option = sc.nextInt();
				if (option == 4) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 10,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
					System.out.println("Reward is: 5,000");
					terminate();
				}
			}
		} else if (option == 1 || option == 2 || option == 3) {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
			System.out.println("Reward is: 5,000");
			terminate();
		}
	}

	// Question-5
	void question5() {
		System.out.println(PINK_256 + name + " Here's your next question:");
		System.out.println(ORANGE_BOLD + "Q5. In which year was Java developed?" + RESET);
		System.out.println(BROWN + "1. 1962");
		System.out.println("2. 1965");
		System.out.println("3. 1995");
		System.out.println("4. 1996");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 20,000");

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 3) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 20,000.");
			System.out.println("Get Ready for the next question.");
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("Audience Phone ");
				if (ff == 1)
					System.out.println("50-50 ");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE + "1. 1962 (15%)" + RESET);
					System.out.println(BLUE + "2. 1965 (25%)" + RESET);
					System.out.println(BLUE + "3. 1995 (45%)" + RESET);
					System.out.println(BLUE + "4. 1996 (15%)" + RESET);
					option = sc.nextInt();
					if (option == 3) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 20,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 10,000");
						terminate();
					}
				} else if (opt.equals("ff")) {
					ff = 0;
					lifeline--;
					System.out.println("2. 1965");
					System.out.println("3. 1995");
					option = sc.nextInt();
					if (option == 3) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 20,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 10,000");
						terminate();
					}
				}
			} else {
				System.out.println("No lifeline available. Please select the correct option:");
				option = sc.nextInt();
				if (option == 3) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 20,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
					System.out.println("Reward is: 10,000");
					terminate();
				}
			}
		} else {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
			System.out.println("Reward is: 10,000");
			terminate();
		}
	}

	// Question-6
	void question6() {
		System.out.println(PINK_256 + name + " Here's your next question:");
		System.out.println(ORANGE_BOLD + "Q6. Who is known as the father of the computer?" + RESET);
		System.out.println(BROWN + "1. Alan Turing");
		System.out.println("2. Charles Babbage");
		System.out.println("3. Dennis Ritchie");
		System.out.println("4. Martin Richards");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 40,000");

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 2) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 40,000.");
			System.out.println("Get Ready for the next question.");
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("Audience Phone ");
				if (ff == 1)
					System.out.println("50-50 ");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE + "1. Alan Turing (60%)" + RESET);
					System.out.println(BLUE + "2. Charles Babbage (62%)" + RESET);
					System.out.println(BLUE + "3. Dennis Ritchie (25%)" + RESET);
					System.out.println(BLUE + "4. Martin Richards (8%)" + RESET);
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 40,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 20,000");
						terminate();
					}
				} else if (opt.equals("ff")) {
					ff = 0;
					lifeline--;
					System.out.println("1. Alan Turing");
					System.out.println("2. Charles Babbage");
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 40,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 20,000");
						terminate();
					}
				}
			} else {
				System.out.println("No lifeline available. Please select the correct option:");
				option = sc.nextInt();
				if (option == 2) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 40,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
					System.out.println("Reward is: 20,000");
					terminate();
				}
			}
		} else {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
			System.out.println("Reward is: 20,000");
			terminate();
		}
	}

	// Question-7
	void question7() {
		System.out.println(PINK_256 + name + " Here's your next question:");
		System.out.println(ORANGE_BOLD + "Q7. Who developed the C Programming Language?" + RESET);
		System.out.println(BROWN + "1. Bjarne Stroustrup");
		System.out.println("2. Charles Babbage");
		System.out.println("3. James Gosling");
		System.out.println("4. Dennis Ritchie");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 80,000");

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 4) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 80,000.");
			System.out.println("Get Ready for the next question.");
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("Audience Phone ");
				if (ff == 1)
					System.out.println("50-50 ");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE + "1. Bjarne Stroustrup (12%)" + RESET);
					System.out.println(BLUE + "2. Charles Babbage (6%)" + RESET);
					System.out.println(BLUE + "3. James Gosling (10%)" + RESET);
					System.out.println(BLUE + "4. Dennis Ritchie (72%)" + RESET);
					option = sc.nextInt();
					if (option == 4) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 80,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 40,000");
						terminate();
					}
				} else if (opt.equals("ff")) {
					ff = 0;
					lifeline--;
					System.out.println("1. Bjarne Stroustrup");
					System.out.println("4. Dennis Ritchie");
					option = sc.nextInt();
					if (option == 4) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 80,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 40,000");
						terminate();
					}
				}
			} else {
				System.out.println("No lifeline available. Please select the correct option:");
				option = sc.nextInt();
				if (option == 4) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 80,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
					System.out.println("Reward is: 40,000");
					terminate();
				}
			}
		} else {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
			System.out.println("Reward is: 40,000");
			terminate();
		}
	}

	// Question-8
	void question8() {
		System.out.println(PINK_256 + name + " Here's your next question:");
		System.out.println(ORANGE_BOLD
				+ "Q8. Which keyword is used to derive the value of a variable from the parent class?" + RESET);
		System.out.println(BROWN + "1. this");
		System.out.println("2. super");
		System.out.println("3. final");
		System.out.println("4. static");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 2,00,000");

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 2) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 1,60,000.");
			System.out.println("Get Ready for the next question.");
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("Audience Phone ");
				if (ff == 1)
					System.out.println("50-50");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE + "1. this (10%)" + RESET);
					System.out.println(BLUE + "2. super (70%)" + RESET);
					System.out.println(BLUE + "3. final (15%)" + RESET);
					System.out.println(BLUE + "4. static (5%)" + RESET);
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 1,60,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 80,000");
						terminate();
					}
				} else if (opt.equals("ff")) {
					ff = 0;
					lifeline--;
					System.out.println("2. super");
					System.out.println("3. final");
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 2,00,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 80,000");
						terminate();
					}
				}
			} else {
				System.out.println("No lifeline available. Please select the correct option:");
				option = sc.nextInt();
				if (option == 2) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 2,00,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
					System.out.println("Reward is: 80,000");
					terminate();
				}
			}
		} else {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
			System.out.println("Reward is: 80,000");
			terminate();
		}
	}

	// Question-9
	void question9() {
		System.out.println(PINK_256 + name + " Here's is your next question:" + RESET);
		System.out.println(ORANGE_BOLD + "Q9. What is the full form of CPU?" + RESET);
		System.out.println(BROWN + "1. Central Process Unit");
		System.out.println("2. Central Processing Unit");
		System.out.println("3. Control Processing Unit");
		System.out.println("4. Central Primary Unit");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 3,00,000");

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 2) {
			System.out.println(GREEN + name + " Your answer is correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 3,00,000.");
			System.out.println("Get Ready for the next question.");
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1) {
					System.out.println("Audience phone");
				}
				if (ff == 1) {
					System.out.println("50-50");
				}

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE
							+ "1. Central Process Unit(20%)\n2. Central Processing Unit(80%)\n3. Control Processing Unit(25%)\n4. Central Primary Unit(15%)"
							+ RESET);
					option = sc.nextInt();

					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 3,00,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 2,00,000");
						terminate();
					}
				} else if (opt.equals("ff")) {
					ff = 0;
					lifeline--;
					System.out.println("2. Central Processing Unit\n3. Control Processing Unit");
					option = sc.nextInt();

					if (option == 2) {
						System.out.println(GREEN + name + " Your answer is correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 3,00,000.");
						System.out.println("Get Ready for the next question.");
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
						System.out.println("Reward is: 2,00,000");
						terminate();
					}
				}
			} else {
				System.out.println("No lifeline available, please select the correct option:");
				option = sc.nextInt();
				if (option == 2) {
					System.out.println(GREEN + name + " Your answer is correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 3,00,000.");
					System.out.println("Get Ready for the next question.");
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
					System.out.println("Reward is: 2,00,000");
					terminate();
				}
			}
		} else if (option == 1 || option == 3 || option == 4) {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from quiz.");
			System.out.println("Reward is: 2,00,000");
			terminate();
		}
	}

	// Question-10
	void question10() {
		System.out.println(PINK_256 + name + " Here's your final question:");
		System.out.println(ORANGE_BOLD + "Q10. Which keyword is used to declare a static variable in Java?" + RESET);
		System.out.println(BROWN + "1. final");
		System.out.println("2. static");
		System.out.println("3. const");
		System.out.println("4. volatile");
		System.out.println("5. Use Lifeline" + RESET);
		System.out.println("Reward for this question is: 5,00,000");

		System.out.println("Select the correct option:");
		option = sc.nextInt();

		if (option == 2) {
			System.out.println(GREEN + name + " Congratulations! All answers are correct" + RESET);
			System.out.println(BRIGHT_PINK + "You have won 5,00,000.");
			System.out.println("Thank you for playing the quiz!");
			terminate();
		} else if (option == 5) {
			if (lifeline > 0) {
				System.out.println("Please select the lifeline:");
				if (aud_phn == 1)
					System.out.println("Audience Phone ");
				if (ff == 1)
					System.out.println("50-50 ");

				opt = sc.next();

				if (opt.equals("aud_phn")) {
					aud_phn = 0;
					lifeline--;
					System.out.println(BLUE + "1. final (15%)" + RESET);
					System.out.println(BLUE + "2. static (70%)" + RESET);
					System.out.println(BLUE + "3. const (10%)" + RESET);
					System.out.println(BLUE + "4. volatile (5%)" + RESET);
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Congratulations! All answers are correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 5,00,000.");
						System.out.println("Thank you for playing the quiz!");
						terminate();
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 3,00,000");
						terminate();
					}
				} else if (opt.equals("ff")) {
					ff = 0;
					lifeline--;
					System.out.println("2. static");
					System.out.println("3. const");
					option = sc.nextInt();
					if (option == 2) {
						System.out.println(GREEN + name + " Congratulations! All answers are correct" + RESET);
						System.out.println(BRIGHT_PINK + "You have won 5,00,000.");
						System.out.println("Thank you for playing the quiz!");
						terminate();
					} else {
						System.out.println(RED + name + " Your answer is wrong" + RESET);
						System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
						System.out.println("Reward is: 3,00,000");
						terminate();
					}
				}
			} else {
				System.out.println("No lifeline available. Please select the correct option:");
				option = sc.nextInt();
				if (option == 2) {
					System.out.println(GREEN + name + " Congratulations! All answers are correct" + RESET);
					System.out.println(BRIGHT_PINK + "You have won 5,00,000.");
					System.out.println("Thank you for playing the quiz!");
					terminate();
				} else {
					System.out.println(RED + name + " Your answer is wrong" + RESET);
					System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
					System.out.println("Reward is: 3,00,000");
					terminate();
				}
			}
		} else {
			System.out.println(RED + name + " Your answer is wrong" + RESET);
			System.out.println(BRIGHT_PINK + "You are eliminated from the quiz.");
			System.out.println("Reward is: 3,00,000");
			terminate();
		}
	}

	void startQuiz() {
		if (!isEliminated) {
			question1();
		}
		if (!isEliminated) {
			question2();
		}
		if (!isEliminated) {
			question3();
		}
		if (!isEliminated) {
			question4();
		}
		if (!isEliminated) {
			question5();
		}
		if (!isEliminated) {
			question6();
		}
		if (!isEliminated) {
			question7();
		}
		if (!isEliminated) {
			question8();
		}
		if (!isEliminated) {
			question9();
		}
		if (!isEliminated) {
			question10();
		}

	}

}

public class MiniProject1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String BRIGHT_PURPLE = "\u001B[95m";
		final String RESET = "\u001B[0m";
		System.out.println(BRIGHT_PURPLE + "Welcome to quiz game!!" + RESET);
		Quiz q = new Quiz();
		q.collectData();
		q.showMoneyTree();
		q.startQuiz();
		sc.close();
	}
}
