/*************************************************************************************************
 * CLASS: Student.java
 *
 * DESCRIPTION
 * This is the super-class Student, it is the parent of both On-Campus & online Students.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring 2022 - Session (B)
 * Project Number: (2)
 *
 * AUTHOR: Ahmed ABDALLA, 1223819974, aabdal16@asu.edu
 ******************************************************************************************************/


public abstract class Student implements Comparable<Student> {

    private int mCredits;
    private String mFirstName;
    private String mId;
    private String mLastName;
    private double mTuition;

    /**
     * Constructor that creates a Student object and initializes the mId, mFirstName, and mLastName instance
     * variables.
     * @param pFirstName
     * @param pId
     * @param pLastName
     */

    public Student (String pId, String pFirstName, String pLastName) {
        mId = pId;
        mFirstName = pFirstName;
        mLastName = pLastName;
    }

    /**
     * calcTuition() is to be implemented by subclasses of Student. Remember that abstract methods
     * are not implemented in a superclass but must either be implemented in a subclass, or if not,
     * then the subclass also becomes an abstract class. The reason calcTuition() is abstract
     * and intended to be implemented by the subclasses of Student is because how we calculate the
     * tuition for an OnCampusStudent is different than how we calculate the tuition for an Online-
     * Student.
     */
     public abstract void calcTuition();

    /**
     * The java.lang.Comparable<T> interface declares one method int compareTo(T obj) that must be
     * implemented by any class which implements the interface. This method is called from Sorter.
     * keepMoving() to compare the mId fields of two Students.
     *
     * Compares the mId fields of 'this' Student and pStudent. Returns -1 if this Student's mId
     * field is less than pStudent's mId field. Returns 0 if this Student's mId field is equal to
     * pStudent's mId field. Returns 1 if this Student's mId field is greater than pStudent's mId
     * field.
     *
     * Note that the mId field of a Student is a java.lang.String and String also implements the
     * Comparable<String> interface and consequently, also implements a compareTo() method to
     * compare two strings. Hence, all we have to do here is to call the String class compareTo()
     * method on the two mId strings of 'this' Student and pStudent and return whatever that method
     * returns.
     */
    @Override
    public int compareTo(Student pStudent) {
        return getId().compareTo(pStudent.getId());
    }

    /**
     * Accessor method for mCredits.
     * @return mCredit
     */
    public int getCredits() {
        return mCredits;
    }

    /**
     * Accessor method for mFirstName.
     * @return mFirstname
     */
    public String getFirstName() {
        return mFirstName;
    }

    /**
     * Accessor method for mId.
     * @return mId
     */
    public String getId() {
        return mId;
    }

    /**
     * Accessor method for mLastName.
     * @return mLastName
     */
    public String getLastName() {
        return mLastName;
    }

    /**
     * Accessor method for mTuition.
     * @return mTuition
     */
    public double getTuition() {
        return mTuition;
    }

    /**
     * Mutator method for mCredits.
     * @param pCredits
     */
    public void setCredits (int pCredits) {
        mCredits = pCredits;
    }

    /**
     * Mutator method for mFirstName.
     * @param pFirstName
     */
    public void setFirstName ( String pFirstName) {
        mFirstName = pFirstName;
    }

    /**
     * Mutator method for mId.
     * @param pId
     */
    public void setId ( String pId) {
        mId = pId;
    }

    /**
     * Mutator method for mLastName.
     * @param pLastName
     */
    public void setLastName (String pLastName) {
        mLastName = pLastName;
    }

    /**
     * Mutator method for mTuition.
     * @param pTuition
     */
    protected void setTuition (double pTuition) {
        mTuition = pTuition;
    }

}
