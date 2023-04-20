package org.yearup.shopping;

import java.util.Scanner;

public class ShoppingListWithLoopsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Invite the user to buy something
        System.out.println("Hello! Welcome to my store. Would you like to purchase something");
        while (true) {
            // Read in the user's response
            String userResponse = scanner.nextLine();
            if (userResponse.equals("yes")) {
                System.out.println("Great! Here are the list of items available");
            } else if (userResponse.equals("no")) {
                System.out.println("Thanks for stopping by!");
                return;
            }


            // Show the user a list of items for sale
            // Only show the product names and IDs, not the prices


            Item[] itemsForSale = ItemsForSale.itemsForSale;
            for (Item i : itemsForSale) {
                if (!i.isInStock()) continue;
                // System.out.println(i);
                System.out.println(i.getDescription() + " " + i.getProductID());

            }


            // Parse their choice and get that item from the list
            System.out.println("\n What is the product id of the item you desire?");
            String selectedProductId = scanner.nextLine();
            Item selectedItem = null;

            for (Item currentItemInListInTheLoop : itemsForSale) {
                if (selectedProductId.equals(currentItemInListInTheLoop.getProductID())) {
                    selectedItem = currentItemInListInTheLoop;

                    // Tell the user they can have it for a price!
                    System.out.println("\n You can purchase it for the price of: $" + (currentItemInListInTheLoop.getPrice() + "\n"));
                    System.out.println("Would You like to Purchase it ");
                    String acceptPrice = scanner.nextLine();
                    if (acceptPrice.equals("yes")) {
                        System.out.println("Perfect! let me take care of that for you! Would you like to purchase any other items?");
                        String otherItems = scanner.nextLine();
                        if (otherItems.equals("yes")) {
                            continue;
                        } else if (otherItems.equals("no")) {

                            break;
                        }

                        //   if no, start over and show them the list again
                    } else if (acceptPrice.equals("no")) {
                        System.out.println("Oh no! Please check out some of my other items!");
                    }
                    //break;
                }


                //
                // Read in the user's response
                //String userResponse2 = scanner.nextLine();
                //if (userResponse2.equals("yes")) {
                //System.out.println("Thank You");

                //String selectedProductPrice = scanner.nextLine();
                // show them the price and ask them to accept it
            }


            // Read their response
            //   if yes, tell them it's theirs
            //   if no, start over and show them the list again


        }
    }
}


