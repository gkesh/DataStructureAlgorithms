package DSA.sorting;


    class InsertionSrot

    {

        
        void insert(int[] a ,int n)

        {

            int key,j;

            
            for (int i = 1; i < n; i++)

            {

                key = a[i];

                j = i - 1;
 
                while( j>=0 && key<a[j])

                {

                    a[j + 1] = a[j];

                    j--;

                }

                a[j + 1] = key;

            }
 
        }

        public static void main(String args[])

        {

            int[] a = { 9, 8, 7, 6, 5 };

         
   InsertionSrot ins = new InsertionSrot();

            ins.insert(a, 5);


            System.out.println("Sorted Element");

            for (int i = 0; i < 5; i++)

            {
 
               System.out.println(a[i]);
 
            }


            
        }


        
        
    }