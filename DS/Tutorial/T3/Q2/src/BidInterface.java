/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * An abstract data type (ADT) representing a single bid
 * for installing an air conditioning unit.
 */
public interface BidInterface {

    /**
     * Returns the name of the company making this bid.
     *
     * @precondition None.
     * @postcondition The company's name is returned.
     * @return the name of the company
     */
    String getCompanyName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     *
     * @precondition None.
     * @postcondition The description of the AC unit is returned.
     * @return the description of the air conditioner
     */
    String getACDescription();

    /**
     * Returns the capacity of this bid's air conditioner in tons.
     * 1 ton = 12,000 BTU.
     *
     * @precondition None.
     * @postcondition The capacity in tons is returned.
     * @return the AC capacity in tons
     */
    double getACCapacityTons();

    /**
     * Returns the seasonal energy efficiency ratio (SEER)
     * of this bid's air conditioner.
     *
     * @precondition None.
     * @postcondition The SEER value is returned.
     * @return the seasonal energy efficiency ratio (SEER)
     */
    double getSEER();

    /**
     * Returns the cost of the air conditioner unit.
     *
     * @precondition None.
     * @postcondition The AC unit cost is returned.
     * @return the cost of the AC unit
     */
    double getACCost();

    /**
     * Returns the cost of installing the air conditioner unit.
     *
     * @precondition None.
     * @postcondition The installation cost is returned.
     * @return the installation cost of the AC unit
     */
    double getInstallationCost();

    /**
     * Returns the estimated yearly cost of operating this air conditioner.
     * This can be calculated using AC capacity, SEER, and electricity rates.
     *
     * @precondition None.
     * @postcondition The yearly operating cost is returned.
     * @return the estimated yearly operating cost
     */
    double getYearlyOperatingCost();
}