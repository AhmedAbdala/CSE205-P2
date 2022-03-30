/*************************************************************************************************
 * CLASS: OnCampusStudent.java
 *
 * DESCRIPTION
 * This is the subclass used for On-Campus Students.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring 2022 - Session (B)
 * Project Number: (2)
 *
 * AUTHOR: Ahmed ABDALLA, 1223819974, aabdal16@asu.edu
 ******************************************************************************************************/

public class OnCampusStudent extends Student {

    public static final int RESIDENT = 1;
    public static final int NON_RESIDENT = 2;
    private int mResident;
    private double mProgramFee;

    /**
     * Constructor for OnCapus Student, it calls the super class to initialize its parameters
     * @param pId
     * @param pFirstName
     * @param pLastName
     */
    public OnCampusStudent (String pId, String pFirstName, String pLastName) {
        super(pId,pFirstName,pLastName );
    }

    /**
     * calcTuition() must be over-ridden in each sub-class, it should inherit the same method
     * signature as in the parent class. so the method shoud return void. the tuition fee is calculated
     * and then passed to the setTuition(t).
     * The tuition fee is calculated as per the rule for On-Campus Student.
     */
    @Override
    public void calcTuition() {
        double t;
        if (getResidency() == RESIDENT){
            t = TuitionConstants.ONCAMP_RES_BASE;
        }
        else {
            t = TuitionConstants.ONCAMP_NONRES_BASE;
        }
        t = t + getProgramFee();

        if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
            t = t + (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }

        setTuition(t);
    }

    /**
     * Accessor method for mProgramFee
     * @return mProgramFee
     */
    public double getProgramFee() {
        return mProgramFee;
    }

    /**
     * Accessor method for mResident
     * @return mResident
     */
    public int getResidency() {
        return mResident;
    }

    /**
     * Mutator method for mProgramFee
     * @param pProgramFee
     */
    public void setProgramFee ( double pProgramFee) {
        mProgramFee = pProgramFee;
    }

    /**
     * Mutator method for mResident
     * @param pResident
     */
    public void setResidency (int pResident) {
        mResident = pResident;
    }

}

