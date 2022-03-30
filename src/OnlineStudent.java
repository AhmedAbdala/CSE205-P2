/*************************************************************************************************
 * CLASS: OnlineStudent.java
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

public class OnlineStudent extends Student {

    private boolean mTechFee;

    /**
     * Constructor for Online Student, it uses the superclass to initialize its parameters.
     * @param pId
     * @param pFirstName
     * @param pLastName
     */
    public OnlineStudent(String pId, String pFirstName, String pLastName) {
        super(pId,pFirstName,pLastName);

    }

    /**
     * calcTuition() must be over-ridden in each sub-class, it should inherit the same method
     * signature as in the parent class. so the method shoud return void. the tuition fee is calculated
     * and then passed to the setTuition(t).
     * The tuition fee is calculated as per the rule for Online Student.
     */
    @Override
    public void calcTuition() {

        double t;
        t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;

        if (getTechFee()) {
            t = t + TuitionConstants.ONLINE_TECH_FEE;
        }

        setTuition(t);
    }

    /**
     * Accessor method for mTechFee
     * @return mTechFee
     */
    public boolean getTechFee() {
        return mTechFee;
    }

    /**
     * Mutator method for mTechFee
     * @param pTechFee
     */
    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }


}
