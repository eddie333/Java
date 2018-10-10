public class add {

    public static void main(String[] args) {

        runAddMethodUnitTests();

    }

    public static int addMethod(int param1, int param2) {

        return (param1 + param2);

    }

    public static void addMethodUnitTests() {

        int m_iFailCount = 0;
        int m_iPassCount = 0;

        // Unit Test #1.
        if (addMethod(1 , 2) == 3)
        {
            System.out.format("%d out of 6 test passed\n",
                    ++m_iPassCount);
        }
        else
        {
            m_iFailCount++;
        }

        // Unit Test #2.
        if (addMethod(0, 1000) == 1000)
        {
            System.out.format("%d out of 6 test passed\n",
                    ++m_iPassCount);
        }
        else
        {
            m_iFailCount++;
        }

        // Unit Test #3.
        if (addMethod(2, -39) == -37)
        {
            System.out.format("%d out of 6 test passed\n",
                    ++m_iPassCount);
        }
        else
        {
            m_iFailCount++;
        }

        // Unit Test #4.
        if (addMethod(99, 100) == 199)
        {
            System.out.format("%d out of 6 test passed\n",
                    ++m_iPassCount);
        }
        else
        {
            m_iFailCount++;
        }

        // Unit Test #5.
        if (addMethod(-100, 100) == 0)
        {
            System.out.format("%d out of 6 test passed\n",
                    ++m_iPassCount);
        }
        else
        {
            m_iFailCount++;
        }

        // Unit Test #6.
        if (addMethod(-1000, -1000) == -2000)
        {
            System.out.format("%d out of 6 test passed\n",
                    ++m_iPassCount);
        }
        else
        {
            m_iFailCount++;
        }

        if (m_iFailCount > 0)
        {
            System.out.format("\n%d out of 6 test failed\n",
                    m_iFailCount);
        }
    }

    public static void runAddMethodUnitTests() {

        addMethodUnitTests();

    }

}
