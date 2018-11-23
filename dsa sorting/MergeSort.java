package DSA.sorting;


   public class MergeSort
    {

      public  static void main(String args[])
        {
            int[] a = { 7, 2, 9, 1, 10, 12 };
            MergeSort m = new MergeSort();
            m.merge(a, 0, 5);

            for (int i = 0; i < 6; i++)
            {
                //System.out.println("Sorted Element");
                System.out.println(a[i]);
            }
            
        }
        void merge(int[] a, int l, int r)
        {
            if (l < r)
            {
                int m = (l + r) / 2;
                merge(a, l, m);
                merge(a, m+1, r);
                sort(a, l,m,r);
            }

           

        }

        void sort(int[] a, int l, int m, int r)
        {
            int[] b = new int[6];
            int x = l;
            int k = l;
            int y = m+1;
            while (x <=m && y <= r)
            {
                if (a[x] < a[y])
                {
                    
                        b[k] = a[x];
                        k++;
                        x++;
                  
                }
                else
                {
                    b[k] = a[y];
                    y++;
                    k++;
                }

            }
            while (x <= m)
            {
                b[k] = a[x];
                k++;
                x++;
            }
            while (y <= r)
            {
                b[k] = a[y];
                k++;
                y++;
            }

            for (int i = l; i <= r; i++)
            {
                a[i] = b[i];
            }

            
        }


    }
