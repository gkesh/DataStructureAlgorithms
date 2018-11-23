package DSA.sorting;


    class QuickSort
    {
        static int[] b = new int[5];

       public  static void main(String[] args)
        {
            int[] a = new int[]{8,2,4,1,9};

            quick(a,0,4);
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Sorted Element" + a[i]);
            }
            
            


        }

        static void quick(int[] a,int l,int r)
        {
            if (l<r)
            {
                int k = partition(a, l, r);

          
                quick(a, l, k-1);
                quick(a, k+1, r);
               

            }
        }

        static int partition(int[] a, int l,int r)
        {
            int pivot;
            pivot = a[l];
            int x = l;
            int y = r;
            while (x < y)
            {
                while (a[x] < pivot)
                    x++;
                while (a[y] > pivot)
                    y--;
                if (x < y)
                {
                    int temp = a[x];
                    a[x] = a[y];
                    a[y] = temp;
                }

            }
            int temp1 = pivot;
            pivot = a[y];
            a[y] = temp1;
            return y;
            


        }
    
    }
