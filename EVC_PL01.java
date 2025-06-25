import java.util.Date;
import java.util.Scanner;
public class EVC_PL01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date currenDateAndTime = new Date();
        int haraa = 20000;
        double money;
        int opp, phone;
        int account_no = 123456;
        int haraga_account = 9000;
        String n = input.nextLine();
        if (n.equals("*770#")) {
            System.out.println("fadlan gali PIN-kaaga");
            int password = input.nextInt();
            if (password == 6230031)

            {
                System.out.println("EVPLus");
                System.out.println("1.itus Haraagaga");
                System.out.println("2.Kaarka hadalka");
                System.out.println("3.Bixi bill");
                System.out.println("4.U wareeji EVCplus");
                System.out.println("5.Warbixin kooban");
                System.out.println("6.Salam bank");
                System.out.println("7.Maareynta");
                System.out.println("8.Bill payment");

                int chose = input.nextInt();
                if (chose == 1) {
                    System.out.println("haraagaga waa " + haraa + "$");
                }

                // kaarka ku hadalka
                else if (chose == 2) {
                    System.out.println("1.ku shuba Airtime");
                    System.out.println("2.ugu shub airtime");
                    System.out.println("3.MIFI Packages");
                    System.out.println("4.ku shuba internet");
                    System.out.println("5.ugu shub qof kle (MMT)");
                    int cho = input.nextInt();
                    switch (cho) {

                        //ku shuba Airtime
                        case 1:
                            System.out.println("fadlan geli lacagta");
                            money = input.nextDouble();
                            System.out.println("ma hubtaa inaa $" + money + "ugu shubtid? ");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            cho = input.nextInt();
                            if (cho == 1) {
                                if (money > haraa)
                                    System.out.println("xisaabtaada kugu ma filna");
                                else {
                                    haraa -= money;
                                    System.out.println("EVC PLUS");
                                    System.out.println("waxaad ku shubatay $" + money + " Tar:" + currenDateAndTime + ", haraagaagu waa " + haraa + "$");
                                }
                            } else
                                System.out.println("mahadsanid");
                            break;

                            //ugu shub airtime
                        case 2:
                            System.out.println("fadlan geli numberka");
                            phone = input.nextInt();
                            System.out.println("fadlan geli lacagta");
                            money = input.nextDouble();
                            System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            opp = input.nextInt();
                            if (opp == 1) {
                                if (money > haraa)
                                    System.out.println("xisaabtaada kugu ma filna");
                                else {
                                    haraa -= money; //
                                    System.out.println("EVC PLUS \nwaxaad ugu shubty $" + money + "\n lambarka " + phone + " Tar:" + currenDateAndTime + "\nHaraagaaga waa $" + haraa);
                                }
                            } else
                                System.out.println("mahadsanid");
                            break;

                            //MIFI Packages
                        case 3:
                            System.out.println("1. Ku shubo data-da MIFI");
                            opp = input.nextInt();
                            System.out.println("--Internet Bundle Recharge--");
                            System.out.println("1. Isbuucle (Weekly)");
                            System.out.println("2. Bille (Mifi)");
                            System.out.println("3. Maalinle (Daily)");
                            opp = input.nextInt();

                            System.out.println("Fadlan dooro bundle-ka:");
                            System.out.println("1. $5 = 10GB");
                            System.out.println("2. $10 = 25GB");
                            opp = input.nextInt();

                            if (opp == 1) {
                                money = 5;
                            } else if (opp == 2) {
                                money = 10;
                            } else {
                                System.out.println("Doorashadada waa khalad");
                                break;
                            }

                            input.nextLine();
                            boolean validUser = false;
                            String mifiUser = "";
                            String correctUser = "ibtisam";

                            while (!validUser) {
                                System.out.print("Fadlan Gali MIFI user: ");
                                mifiUser = input.nextLine();
                                if (!mifiUser.matches("[a-zA-Z0-9]+")) {
                                    System.out.println("Invalid input format (dataType).");
                                } else if (!mifiUser.equals(correctUser)) {
                                    System.out.println("User-ka lama helin");
                                } else {
                                    validUser = true;
                                }
                            }

                            if (validUser) {
                                if (haraa >= money) {
                                    haraa -= money;
                                    System.out.println("Waxaad ku shubatay $" + money + " Tar: " + currenDateAndTime + ", haraagaagu waa $" + haraa);
                                } else {
                                    System.out.println("Haraagaaga kuma filna  $" + money);
                                }
                            }
                            break;

                            //ku shuba internet
                        case 4:
                            System.out.println("fadlan doora numberka ");
                            System.out.println("1.Isbuucle(weekly)");
                            System.out.println("2.Bille (Mifi)");
                            System.out.println("3.Maalinle (Daily)");
                            System.out.println("4.TIME BASED PACKAGES");
                            System.out.println("5.DATA");

                            opp = input.nextInt();
                            System.out.println("Fadlan Gali Numberka");
                            phone = input.nextInt();
                            System.out.println("fadlan gali lacgta");
                            money = input.nextDouble();
                            System.out.println("ma hubtaa inaad $" + money + "ugu shubtid" + phone + "?");
                            System.out.println("1. haa");
                            System.out.println("2. maya");
                            opp = input.nextInt();
                            if (opp == 1) {
                                if (phone >= 610000000 && phone <= 616666666) {
                                    if (money > haraa)
                                        System.out.println("xisaabtaada kugu ma filna");
                                    else {
                                        haraa -= money; // update balance
                                        System.out.println("EVC PLUS \nwaxaad ugu shubty $" + money + "\n lambarka " + phone + "\n Tar:" + currenDateAndTime + "\n Haraagaaga waa $" + haraa);
                                    }

                                } else
                                    System.out.println("lambarka aad galisay ma ahan mid jiro");
                            } else
                                System.out.println("mahadsanid");

                            break;

                            //ugu shub qof kle (MMT)
                        case 5:
                            System.out.println("fadlan geli numberka");
                            phone = input.nextInt();
                            System.out.println("fadlan geli lacagta");
                            money = input.nextDouble();
                            System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            opp = input.nextInt();
                            if (opp == 1) {
                                if (money > haraa)
                                    System.out.println("xisaabtaada kugu ma filna");
                                else {
                                    haraa -= money;
                                    System.out.println("EVC PLUS \nwaxaad ugu shubty $" + money + "\n lambarka " + phone + "\n Tar:" + currenDateAndTime + "\n Haraagaaga waa $" + haraa);
                                }
                            } else
                                System.out.println("mahadsanid");
                            break;

                        default:
                            System.out.println("fadlan doora numberka saxda ah");
                    }
                }

                else if (chose == 3) {
                    System.out.println("Bixi Biil");
                    System.out.println("1.Post pad");
                    System.out.println("2.ku ibso");
                    opp = input.nextInt();

                    if (opp == 1) {
                        System.out.println("Post paid");
                        System.out.println("1.ogow Biilka");
                        System.out.println("2.Bixi Bill");
                        System.out.println("3.Bixi Bill");
                        opp = input.nextInt();
                        switch (opp) {
                            case 1:
                                System.out.println("error ocurred,please try again");
                                break;
                            case 2:
                                System.out.println("fadlan geli lacagta");
                                money = input.nextDouble();
                                System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay:$" + money + "?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                opp = input.nextInt();
                                if (opp == 1) {
                                    if (money > haraa)
                                        System.out.println("haraaga xisaabtaada kugu ma filana");
                                    else {
                                        haraa -= money; // update balance
                                        System.out.println("waxaad bixisay bill \nlacagtiisu tahay $" + money + " Tar:" + currenDateAndTime + " haraagaagu waa " + haraa);
                                    }
                                } else
                                    System.out.println("mahadsanid");
                                    break;
                            case 3:
                                System.out.println("fadlan geli numberka");
                                phone = input.nextInt();
                                System.out.println("fadlan geli lacagta");
                                money = input.nextDouble();
                                System.out.println("Ma Hubtaa inaad bixisid bill \n lacagtiisu tahay $" + money + "oo laga rabo tel No" + phone + " ");
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");
                                opp = input.nextInt();
                                if (opp == 1) {
                                    if (money > haraa)
                                        System.out.println("haraaga xisaabtaada kugu ma filana");
                                    else {
                                        haraa -= money;
                                        System.out.println("waxaad bixisay bill lacagtiisu tahay $" + money + " oo laga rabay tel No " + phone + " Tar:" + currenDateAndTime + " haraagaagu waa " + haraa);
                                    }
                                } else
                                    System.out.println("mahadsanid!");
                                break;
                            default:
                                System.out.println("fadlan doora numberka sax ah");
                        }
                    } else if (opp == 2) {
                        System.out.println("fadlan geli aqoonsiga ganacsigaada");
                        opp = input.nextInt();
                        int aqoonsiga = opp;
                        String businessName = "";
                        switch (aqoonsiga) {
                            case 10:
                                businessName = "Telesom";
                                break;
                            case 20:
                                businessName = "Somtel";
                                break;
                            case 103:
                                businessName = "Zaad";
                                break;
                            default:
                                System.out.println("Ganacsi ID-gaas lama aqoonsan Fadlan hubi");
                        }

                        System.out.println("Fadlan geli lacagta:");
                        money = input.nextDouble();

                        System.out.println("Ma hubtaa inaad $" + money + " u dirto ganacsiga: " + businessName + " (ID: " + aqoonsiga + ")?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int op = input.nextInt();

                        if (op == 1) {
                            if (money <= haraa) {
                                haraa -= money;
                                System.out.println("Waxaad u dirtay $" + money + " ganacsiga " + businessName);
                                System.out.println("Tar" + currenDateAndTime + " Haraagaagu waa $" + haraa);
                            } else {
                                System.out.println("Haraagaagu kuguma filna");
                            }
                        } else {
                            System.out.println("Mahadsanid!");
                        }
                    }
                }

                // u wareeji EVCplus
                else if (chose == 4) {
                    System.out.println("fadlan geli numberka");
                    phone = input.nextInt();
                    System.out.println("fadlan geli lacagta");
                    money = input.nextDouble();
                    System.out.println("Ma Hubtaa inaad $" + money + " u wareejisay " + phone + " ");
                    System.out.println("1.Haa");
                    System.out.println("2.Maya");
                    opp = input.nextInt();
                    if (opp == 1) {
                        if (money > haraa)
                            System.out.println("haraaga xisaabtaada kugu ma filna");
                        else {
                            haraa -= money;
                            System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + phone + " Tar:" + currenDateAndTime + " haraagaagu waa " + haraa);
                        }
                    } else
                        System.out.println("mahadsanid!");
                }

                // warbixin kooban
                else if (chose == 5) {
                    warbixinKooban(input, currenDateAndTime);
                }

                // salam bank
                else if (chose == 6) {
                    salaamBank(input);
                }
                // maareynta
                else if (chose == 7) {
                    maareynta(input, currenDateAndTime, password);
                }
                else {
                    System.out.println("Doorasho aan sax ahayn.");
                }

            } else
                System.out.println("pin kaaga waa qalad");
        }

    }

    // warbixin kooban
    public static void warbixinKooban(Scanner input, Date date) {
        System.out.println("1: Last Action");
        System.out.println("2: Wareejintii u dambeysay");
        System.out.println("3: Iibsashadii u dambeysay");
        System.out.println("4: Last 3-Actions");
        int opp = input.nextInt();

        switch (opp) {
            case 1:
                System.out.println("$1 ayaad u wareejisay +252_612222222, date: " + date);
                break;
            case 2:
                System.out.println("1. U dirtay");
                System.out.println("2. Ka heshay");
                input.nextInt();
                System.out.println("operation succeeded\nNo Transactions to display!");
                break;
            case 3:
                System.out.println("Geli aqoonsiga ganacsigaada:");
                input.nextInt();
                System.out.println("operation succeeded\nNo Transactions to display!");
                break;
            case 4:
                System.out.println("Your mini statement has been sent as SMS to your registered mobile no.");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah.");
        }
    }

       // salam bank
     public static void salaamBank(Scanner input) {
        String[] bankAccounts = {"123456",};
        int[] bankPins = {202020};
        double[] bankBalances = {1000.0};

        System.out.println("Salaam Bank:");
        System.out.println("1. Itus Haraaga");
        System.out.println("2. Lacag Dhigasho");
        System.out.println("3. Lacag Qaadasho");
        System.out.println("4. Ka Wareeji EVC Plus");
        int choice = input.nextInt();

        System.out.print("Geli account numberka: ");
        String acc = input.next();
        System.out.print("Geli PIN-ka: ");
        int pin = input.nextInt();

        int index = -1;
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i].equals(acc) && bankPins[i] == pin) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Account number ama PIN waa qalad.");
        }

        switch (choice) {
            case 1:
                System.out.println("Haraagaaga waa $" + bankBalances[index]);
                break;
            case 2:
                System.out.print("Geli lacagta: ");
                double deposit = input.nextDouble();
                bankBalances[index] += deposit;
                System.out.println("Waad dhigatay $" + deposit + ", Haraaga: $" + bankBalances[index]);
                break;
            case 3:
                System.out.print("Geli lacagta: ");
                double withdraw = input.nextDouble();
                if (withdraw <= bankBalances[index]) {
                    bankBalances[index] -= withdraw;
                    System.out.println("Waad kala baxday $" + withdraw + ", Haraaga: $" + bankBalances[index]);
                } else {
                    System.out.println("Haraagaagu kuguma filna.");
                }
                break;
            case 4:
                System.out.print("Geli numberka EVC Plus: ");
                String phone = input.next();
                System.out.print("Geli lacagta: ");
                double amount = input.nextDouble();
                if (amount <= bankBalances[index]) {
                    bankBalances[index] -= amount;
                    System.out.println("Waxaad u wareejisay $" + amount + " lambarka " + phone);
                    System.out.println("Haraaga: $" + bankBalances[index]);
                } else {
                    System.out.println("Haraagaagu kuguma filna.");
                }
                break;
        }
    }

    // maareynta
    public static void maareynta(Scanner input, Date currenDateAndTime, int password) {
        int opp, phone;
        System.out.println("Maareynta");
        System.out.println("1.Bedal lambarka sirta ah");
        System.out.println("2.bedal luqadda");
        System.out.println("3.wargelin mobil lumay");
        System.out.println("4.lacag xirasho");
        System.out.println("5.celin lacag soo qaldanty");
        opp = input.nextInt();

        //Bedal lambarka sirta ah
        if (opp == 1) {
            System.out.println("Fadlan geli pinkaaga cusub");
            password = input.nextInt();
            System.out.println("Hubi pinkaaga cusub");
            int pass = input.nextInt();
            while (password != pass) {
                System.out.println("INPUT MISMATCH \n Hubi PIN-Kaaga cusub");
                pass = input.nextInt();
            }
            System.out.println("waxaad ku guuleysaty inaad badasho PIN-kaaga");

            // luuqad badalidda
        } else if (opp == 2) {
            System.out.println("Fadlan dooro luqada");
            System.out.println("1.English");
            System.out.println("2.Somali");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("[-EVCPLUS-] you have successfully changed your language");
            else if (opp == 2)
                System.out.println("[-EVCPLUS-] waad ku guulaysatay in aad badasho luqadda");

            //mobile dhumay
        } else if (opp == 3) {
            System.out.println("Fadlan geli mobilka lumay");
            phone = input.nextInt();
            System.out.println("fadlan geli  sirta numberka");
            int pas = input.nextInt();
            System.out.println("Ma hubtaa in aad u diiwaan geliso number lumay " + phone + "?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysatay inaad diwaan geliso " + phone + " " + currenDateAndTime);
            else
                System.out.println("Mahadsanid");

            //lacag xayiraad
        } else if (opp == 4) {
            System.out.println("Fadlan geli numberka lagu Qalday");
            int numberka_lagu_qadlay = input.nextInt();
            System.out.println("Fadlan geli numberka loo rabay");
            int numberka_loo_rabay = input.nextInt();
            System.out.println("Fadlan geli macluumaad");
            opp = input.nextInt();
            System.out.println("Ma hubtaa in aad xirto lacagta?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysty inaad xirto lacagta");
            else
                System.out.println("Mahadsanid");

            //lacag celin
        } else if (opp == 5) {
            System.out.println("Fadlan geli aqoonsiga lacag diridda");
            int aqoonsiga = input.nextInt();
            System.out.println("Fadlan geli macluumaad kaga");
            opp = input.nextInt();
            System.out.println("Ma hubtaa in aad celiso lacagta ?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysty inaad celiso lacagta");
            else
                System.out.println("Mahadsanid");
        }
    }
}                                //IBTISAM ABDIRAHMAN
                                 //C6230031
                                //CNS231