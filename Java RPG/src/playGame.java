import java.util.Scanner;

public class playGame
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static String pause;
		static Player p;
		static int overworldChoice;
		static boolean overworldLoop = true;
		static boolean battle = true;
		static int playerHP;
		static int playerLV;
		static int enemyHP;
		static int playerMove;
		static int playerAttack;
		static int playerAct;
		static int playerSpare;
		static int spareThreshold;
		static int enemyAttack;

		public static void main(String[] args)
			{
				p = new Player (" ", 20, 0, 1, 0, 20, 1);
				//IntroCutscene();
				//nameGetter();
				//gameIntro();
//				ruins();
				froggitBattle();
				System.out.println("ok");
				pause = userStringInput.nextLine();
				froggitBattle2();
			}
		public static void IntroCutscene() {
		System.out.println("Long ago, two races ruled over Earth: HUMANS and MONSTERS.");
		System.out.println("(Press the enter key to continue)");
		pause = userStringInput.nextLine();
		System.out.println("One day, war broke out between the two races.");
		pause = userStringInput.nextLine();
		System.out.println("After a long battle, the humans were victorious.");
		pause = userStringInput.nextLine();
		System.out.println("They sealed the monsters underground with a magic spell.");
		pause = userStringInput.nextLine();
		System.out.println("Many years later...");
		pause = userStringInput.nextLine();
		System.out.println("MT. EBBOT");
		System.out.println("201X");
		pause = userStringInput.nextLine();
		System.out.println("Legends say that those who climb the mountain never return.");
		pause = userStringInput.nextLine();
		System.out.println("A rambunctious child is seen running to the open top of the mountain.");
		pause = userStringInput.nextLine();
		System.out.println("They trip on a tree root and fall into the mountain.");
		}
		public static void nameGetter() {
			System.out.println("Name the fallen human.");
			int characterlockin;
			String charName = userStringInput.nextLine();
				System.out.println("Is " + charName + " the name you want? 1 = Yes, 2 = No.");
				characterlockin = userIntInput.nextInt();
				if (characterlockin==1) {
					System.out.println("You have chosen the name " + charName + ".");
					p.setName(charName);
				} else if (characterlockin==2) {
					nameGetter();
				} else {
					System.out.println("It was a really simple yes or no?");
					nameGetter();
				}
		}
		public static void gameIntro(){
		System.out.println("* You wake up face down in a bed of sunflowers.");
		pause = userStringInput.nextLine();
		System.out.println("* You look up at the hole you fell through, this possibly the last time you'll see sunlight.");
		pause = userStringInput.nextLine();
		System.out.println("* You spot a path in front of you.");	
		pause = userStringInput.nextLine();
			while(overworldLoop) {
				System.out.println("* Continue forth? 1 = Yes, 2 = No.");	
				overworldChoice = userIntInput.nextInt();
				if(overworldChoice==1) {
					overworldLoop = false;
					System.out.println("* You walk toward a large door in the distance.");
					pause = userStringInput.nextLine();
					System.out.println("* Through the door, you enter a large room, pitch black.");
					pause = userStringInput.nextLine();
					System.out.println("* You see a small, yellow flower in the distance.");
					pause = userStringInput.nextLine();
					System.out.println("* Against your own will, he starts talking to you.");
					pause = userStringInput.nextLine();
					System.out.println("???:* Howdy! I'm Flowey! Flowey the flower!");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Hmmm...");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* You're new to the underground, aren'tcha?");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Golly, you must be so confused...");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Someone aughta teach you how things work around here.");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* I guess little old me will have to do...");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Ready? Here we Go!");
					pause = userStringInput.nextLine();
					System.out.println("* Seemingly like second nature, you are flung into a battle.");
					pause = userStringInput.nextLine();
					floweyTutorialBattle();
					System.out.println("???:* You are safe now, my child.");
					pause = userStringInput.nextLine();
					System.out.println("* You spot a shadowy figure walking toward you.");
					pause = userStringInput.nextLine();
					System.out.println("* As they come closer they become more clear to you.");
					pause = userStringInput.nextLine();
					System.out.println("* They seem to be some sort of... goat person?");
					pause = userStringInput.nextLine(); 
					System.out.println("???:* Do not worry, my child. My name is Toriel, and I'm here to help you.");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel grasps your hand.");
					pause = userStringInput.nextLine(); 
					System.out.println("Toriel:* Come with me, my child. We need to get you somewhere less dangerous.");
					pause = userStringInput.nextLine(); 
					System.out.println("* You and Toriel start walking toward a doorway, with dim light eminating from it.");
					pause = userStringInput.nextLine();
					System.out.println("* All of a sudden, you seem to be in a very brightly lit and lively place.");
					pause = userStringInput.nextLine(); 
					
				} else if (overworldChoice==2) {
					System.out.println("* You bask in the sunlight for a little bit longer.");
				} else {
					System.out.println("* That's not an option.");
				}
			}
		}
		public static void ruins(){
			System.out.println("* You see yourself in a place covered with purple bricks on the walls, roots, and moss.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* This, my child, are the RUINS. This will be your new home from now on.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Allow me to educate you on how these RUINS function.");
			pause = userStringInput.nextLine(); 
			System.out.println("* Next to Toriel, you spot 6 buttons and a switch on the wall.");
			pause = userStringInput.nextLine(); 
			System.out.println("* Toriel swiftly presses 2 of the buttons down, and then presses the switch.");
			pause = userStringInput.nextLine(); 
			System.out.println("Toriel:* The RUINS are full of puzzles.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Ancient fusions between diversions and doorkeys.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* You must be able to solve them from room to room.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Please get accustomed to them.");
			pause = userStringInput.nextLine();
			System.out.println("* You move on to the next room with Toriel, where you spot several swithces on the wall.");
			pause = userStringInput.nextLine(); 
			System.out.println("Toriel:* I have made a puzzle in this room to acustom you.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* You must press the correct switch to move on.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Do not worry, I have labeled them for you.");
			pause = userStringInput.nextLine();
			System.out.println("* You see one normal switch on the wall, and one that has several paragraphs, notes, amd arrows pointing to it");
			pause = userStringInput.nextLine();
			System.out.println("* Which one should you press? 1 = normal switch, 2 = labeled switch");
			overworldChoice = userIntInput.nextInt();
				if (overworldChoice==1) {
					System.out.println("* You press the unlabeled switch.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel goes over and presses the labeled switch herself.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Great job, my child. Let us continue forth.");
					pause = userStringInput.nextLine();
					System.out.println("* You feel a strange sense of shame");
					pause = userStringInput.nextLine();
				} else if (overworldChoice==2) {
					System.out.println("* You press the labeled switch.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Great job, my child. Let us continue forth.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* I'm sure my subtle hint helped you.");
					pause = userStringInput.nextLine();
					System.out.println("* You're not sure you agree with 'subtle' but agree anyways to not be rude");
					pause = userStringInput.nextLine();
				} else {
					System.out.println("* You stand completely still.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . . ?");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel goes over and presses the labeled switch herself.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* ...are you okay? Maybe that was too hard... let's just go forth, okay?");
					pause = userStringInput.nextLine();
					System.out.println("* You feel... something? You're not sure what your emotion is after that.");
					pause = userStringInput.nextLine();
				}
				System.out.println("* You walk into a room with a dummy in it.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* Ah yes, this is the tutorial dummy.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* That introduction fight earlier wasn't exactly... ideal. So if you want, you may fight this dummy.");
				pause = userStringInput.nextLine();
				System.out.println("* Fight the dummy? 1 = Yes, 2 = No");
				overworldChoice = userIntInput.nextInt();
					if (overworldChoice==1) {
						dummyTutorialBattle();
					} else {
						System.out.println("Toriel:* I see. Well, lets just continue past this.");
					}
		}
		public static void froggitBattle() {
			Monster froggit = new Monster ("Froggit", 30, 1, 2, 5, 5, 1, true);
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = froggit.getHitPoints();
			spareThreshold = froggit.getSparePoints();
			System.out.println(froggit.getName() + " draws near!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* Froggit doesn't seem to want to fight anymore.");
				} else if (spareThreshold>0) {
					System.out.println("* Froggit isn't sure what's going on, but is fighting you anyways.");
				} else if (enemyHP<=10) {
					System.out.println("* Froggit is trying to run away.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - froggit.getDefence();
					System.out.println("* You hit " + froggit.getName() + " for " + playerAttack + " damage.");
					enemyHP = froggit.getHitPoints() - playerAttack;
					froggit.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Flirt, 3 = Threaten, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(froggit.getName() + ": ATK - " + froggit.getAttack() + ", DEF - " + froggit.getDefence() + ". Life is difficult for this enemy.");
					} else if (playerAct==2) {
						System.out.println("* You compliment Froggit on their... amphibian features.");
						System.out.println("Froggit:* (blushes deeply) Ribbit...");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You tell Froggit you're going to beat them up behind the school gym.");
						System.out.println("Froggit:* (shaking) R-Ribbit...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + froggit.getName() + ".");
							System.out.println("* " + froggit.getName() + " was spared. You get 0 exp and " + froggit.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+froggit.getGoldGiven());
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + froggit.getName() + ".");
							System.out.println("* But " + froggit.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + froggit.getName() + " was defeated. You get " + froggit.getExecutionPoints() + " exp and " + froggit.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+froggit.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+froggit.getExecutionPoints());
					froggit.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*froggit.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + froggit.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + froggit.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints(playerHP);
						}
				}
				
			}	
		}
		public static void froggitBattle2() {
			Monster froggit2 = new Monster ("Froggit", 30, 1, 2, 5, 5, 1, true);
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = froggit2.getHitPoints();
			spareThreshold = froggit2.getSparePoints();
			System.out.println(froggit2.getName() + " draws near!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* Froggit doesn't seem to want to fight anymore.");
				} else if (spareThreshold>0) {
					System.out.println("* Froggit isn't sure what's going on, but is fighting you anyways.");
				} else if (enemyHP<=10) {
					System.out.println("* Froggit is trying to run away.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - froggit2.getDefence();
					System.out.println("* You hit " + froggit2.getName() + " for " + playerAttack + " damage.");
					enemyHP = froggit2.getHitPoints() - playerAttack;
					froggit2.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Flirt, 3 = Threaten, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(froggit2.getName() + ": ATK - " + froggit2.getAttack() + ", DEF - " + froggit2.getDefence() + ". Life is difficult for this enemy.");
					} else if (playerAct==2) {
						System.out.println("* You compliment Froggit on their... amphibian features.");
						System.out.println("Froggit:* (blushes deeply) Ribbit...");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You tell Froggit you're going to beat them up behind the school gym.");
						System.out.println("Froggit:* (shaking) R-Ribbit...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + froggit2.getName() + ".");
							System.out.println("* " + froggit2.getName() + " was spared. You get 0 exp and " + froggit2.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+froggit2.getGoldGiven());
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + froggit2.getName() + ".");
							System.out.println("* But " + froggit2.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + froggit2.getName() + " was defeated. You get " + froggit2.getExecutionPoints() + " exp and " + froggit2.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+froggit2.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+froggit2.getExecutionPoints());
					froggit2.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*froggit2.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + froggit2.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + froggit2.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints(playerHP);
						}
				}
				
			}	
		}
		public static void floweyTutorialBattle() {
			Monster flowey = new Monster ("Flowey", 30, 1, 2, 5, 0, 0, true);
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = flowey.getHitPoints();
			spareThreshold = flowey.getSparePoints();
			System.out.println(flowey.getName() + " draws near!");
				if(spareThreshold>0) {
					System.out.println("Flowey:* Hey! See that menu down there? That's your BATTLE MENU!");
					System.out.println("Flowey:* This lets you do all sorts of things in battle.");
					System.out.println("Flowey:* Above that battle menu are your stats! LV stands for love, and you can get more by gaining exp!");
					System.out.println("Flowey:* Hit the ACT key (2 on your keyboard), I'll show you some cool stuff you can do!");
				while (battle) {
				if (spareThreshold<=0&&playerMove==2) {
					System.out.println("Flowey:* Great! Now here comes the best part.");
					System.out.println("Flowey:* In a battle, you don't have to kill!");
					System.out.println("Flowey:* Press that Mercy button, and you'll be able to spare me!");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* You got your ears open bud? I said hit the ACT key.");
					} else if (spareThreshold<=0) {
						System.out.println("Flowey:* ...You serious? This is like, the dictionary OPPOSITE of mercy. Try again.");
					}
				} else if (playerMove==2) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* Great! That down there is the ACT menu. You can do all sorts of things with this!");
						System.out.println("ACT: 1 = Check, 2 = Converse, 3 = Stare");
						playerAct = userIntInput.nextInt();
							if(playerAct==1) {
							System.out.println(flowey.getName() + ": ATK - " + flowey.getAttack() + ", DEF - " + flowey.getDefence() + ". Your good pal Flowey.");
							spareThreshold = spareThreshold - 1;
						} else if (playerAct==2) {
							System.out.println("* You tried to start a conversation with flowey.");
							System.out.println("Flowey:* I appreciate the intent, but I'm kinda busy with... well, this.");
							spareThreshold = spareThreshold - 1;
						} else if (playerAct==3) {
							System.out.println("* You just kinda... stared at Flowey");
							System.out.println("Flowey:* Uhh.... I'm just going to assume this was an ACT.");
							spareThreshold = spareThreshold - 1;
						}
					} else if (spareThreshold<=0) {
						System.out.println("Flowey:* You JUST did this. what kinda memory do people from the surface have?");
					}
				} else if (playerMove==3) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* Does this look like an ACT menu to you, numbskull?");
					} else if(spareThreshold<=0) {
						System.out.println("Flowey:* Does this looks like a Mercy menu to you, numbskull?");
					}
				} else if (playerMove==4) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* Do what you're told and just hit the ACT key! Is everyone from the surface this idiotic...?");
					} else if (spareThreshold<=0){
						battle = false;
						System.out.println("Flowey:* Good job! Now I've been spared.");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* ...");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* You IDIOT.");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* DID YOU REALLY THINK THAT'S HOW THIS WORKED?");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* IN THIS WORLD...");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* IT'S KILLED OR BE KILLED!");
						pause = userStringInput.nextLine();
						System.out.println("* Flowey starts to attack you. He has you cornered.");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* HAHAHAHAHAHAHAHA--");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* AH-");
						pause = userStringInput.nextLine();
						System.out.println("* Suddenly, a fireball comes out of nowhere and knocks Flowey out of place.");
						pause = userStringInput.nextLine();
					}
				}
				}
			}	
		}
		public static void dummyTutorialBattle() {
			Monster dummy = new Monster ("Dummy", 20, 0, 1, 2, 0, 0, true);
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = dummy.getHitPoints();
			spareThreshold = dummy.getSparePoints();
			System.out.println(dummy.getName() + " draws near!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* The dummy doesn't seem to want to fight anymore.");
					System.out.println("Toriel:* Text like that tells you when an enemy can be spared. Use context clues to your advantage!");
				} else if (spareThreshold>0) {
					System.out.println("* The dummy sure is just standing there.");
				} else if (enemyHP<=dummy.getHitPoints()) {
					System.out.println("* You see one drop of sweat fall from the dummy's head");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - dummy.getDefence();
					System.out.println("* You hit " + dummy.getName() + " for " + playerAttack + " damage.");
					enemyHP = dummy.getHitPoints() - playerAttack;
					dummy.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Hug, 3 = Talk, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(dummy.getName() + ": ATK - " + dummy.getAttack() + ", DEF - " + dummy.getDefence() + ". Life is difficult for this enemy.");
					} else if (playerAct==2) {
						System.out.println("* You talk to the dummy.");
						System.out.println("Dummy:* . . . ");
						System.out.println("* They doesn't seem to be much for conversation.");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You hug the dummy.");
						System.out.println("Dummy:* . . . :)");
						System.out.println(" They seem to have liked that...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + dummy.getName() + ".");
							System.out.println("* " + dummy.getName() + " was spared. You get 0 exp and " + dummy.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+dummy.getGoldGiven());
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + dummy.getName() + ".");
							System.out.println("* But " + dummy.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("Toriel:* In a normal battle you can flee by doing this, but I would rather you just finish this fight, my child.");
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + dummy.getName() + " was defeated. You get " + dummy.getExecutionPoints() + " exp and " + dummy.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+dummy.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+dummy.getExecutionPoints());
					dummy.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					System.out.println("* . . .");
						if (playerHP<=0){
							System.out.println("* " + dummy.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
						}
				}
				
			}	
		}
				
	}

