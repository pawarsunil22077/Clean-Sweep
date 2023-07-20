//Function to sweep the room
fn clean_room() {
    println!("Cleaning the room");
    
    //Open the windows
    println!("Opening the windows to let the fresh air in");

    //Vacuum the floor
    println!("Vacuuming the floor to get rid of dirt and dust");

    //Dust the furniture
    println!("Dusting off the furniture to get rid of dirt and dust");

    //Clean any spills
    println!("Using a cloth to clean any spills");

    //Wipe down surfaces
    println!("Using a cloth to wipe down all surfaces to remove dust");

    //Empty the bins
    println!("Empty all bins and dispose of garbage properly");

    //Put away all items
    println!("Put away all items and put them in their rightful places");

    //Mop the floor
    println!("Using a mop or cloth to remove any dirt and debris from the floor");

    //Close the windows
    println!("Closing the windows to ensure privacy and security");

    println!("Room cleaning is complete!");
}

//Function to sweep the yard
fn clean_yard() {
    println!("Cleaning the yard");

    //Cut the grass
    println!("Cutting the grass to maintain an even height");

    //Clean the grime
    println!("Using a scraper to remove any dirt and grime from surfaces");

    //Trim any plants
    println!("Trimming any bushes and trees to keep them looking neat");

    //Remove any weeds
    println!("Removing any weeds with a shovel or weed killer");

    //Sweep the pathways
    println!("Sweeping any pathways or pebbles to remove any dirt and debris");

    //Clean the furniture
    println!("Using a cloth to clean any garden furniture and remove dirt and dust");

    //Mop the floor
    println!("Using a mop or cloth to remove any dirt and debris from the floor");

    println!("Yard cleaning is complete!");
}

// Function to call other cleaning functions
fn sweep() {
    clean_room();
    clean_yard();
}

// Run the 'sweep' function
fn main() {
    sweep();
}