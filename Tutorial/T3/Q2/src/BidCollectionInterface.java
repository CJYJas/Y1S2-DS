/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * An abstract data type (ADT) representing a collection of
 * bids for installing air conditioning units.
 */
public interface BidCollectionInterface {

    /**
     * Adds a bid to this collection.
     *
     * @precondition bid is not null.
     * @postcondition The bid is added to the collection.
     * @param bid the bid to be added
     */
    void addBid(BidInterface bid);

    /**
     * Returns the bid in this collection with the best (lowest) yearly operating cost.
     *
     * @precondition The collection is not empty.
     * @postcondition The bid with the lowest yearly operating cost is returned.
     * @return the bid with the best yearly operating cost
     */
    BidInterface getBestYearlyCostBid();

    /**
     * Returns the bid in this collection with the best (lowest) initial cost.
     * Initial cost = unit cost + installation cost.
     *
     * @precondition The collection is not empty.
     * @postcondition The bid with the lowest initial cost is returned.
     * @return the bid with the best initial cost
     */
    BidInterface getBestInitialCostBid();

    /**
     * Clears all bids from this collection.
     *
     * @precondition None.
     * @postcondition The collection is empty.
     */
    void clear();

    /**
     * Gets the number of bids currently in this collection.
     *
     * @precondition None.
     * @postcondition The number of bids is returned.
     * @return the number of bids in the collection
     */
    int getNumberOfBids();

    /**
     * Checks whether this collection is empty.
     *
     * @precondition None.
     * @postcondition Returns true if the collection has no bids; false otherwise.
     * @return true if the collection is empty, false otherwise
     */
    boolean isEmpty();
}