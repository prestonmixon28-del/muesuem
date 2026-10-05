# Journal
Ive oveerride equals so java can compare artifacts by their ID instead of checking if they are the exact same object. The swap with last method is faster because it removes an item without shifting all the other items.

A linked collection can add items quick because it does not need to resize an array. However, each item uses extra memory for its link, and linked collections are usually slower to access because the computer has to follow each link. An array collection has better cache locality because its items are stored next to each other.

Comparable tells java how to sort objects. Here it sorts artifacts by their id. compareTo returns 0 when two objects are equal.