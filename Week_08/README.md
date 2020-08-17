# 位运算

* &   与    两个位都为1时，结果才为1
* |   或    两个位都为0时，结果才为0
* ^   异或  两个位相同为0，相异为1
* ~   取反  0变1，1变0
* <<  左移  各二进位全部左移若干位，高位丢弃，低位补0		
* >>  右移	各二进位全部右移若干位，对无符号数，高位补0，有符号数，各编译器处理方法不一样，有的补符号位（算术右移），有的补0（逻辑右移）


## 异或操作的一些特点
 * x ^ 0 = x
 * x ^ 1s = ~x //注意1s = ~0，即1s代表的是全1
 * x ^ (~x) = 1s
 * x ^ x = 0
 * c = a ^b => a ^ c = b, b ^ c = a //交换两个数
 * a ^ b ^ c = a ^ (b ^ c) = (a ^ b) ^ c // associative
## 指定位置的位运算
 * 将x最右边的n位清零: x & (~0 << n)
 * 获取x的第n位值(0或者1): (x >> n) & 1
 * 获取x的第n位的幂值: x & (1 << n)
 * 仅将第n位置为1: x | (1 << n)
 * 仅将第n位置为0: x & (~(1 << n))
 * 将x最高位至第n位(含)清零: x & ((1 << n) - 1)
 * 判断奇数偶数: (x & 1) == 1(奇数); (x & 1) == 0(偶数)
 * x >> 1 => x / 2
 * x = x & (x - 1) 清零最低位的1
 * x & -x => 得到最低位的1
 * x & ~x => 0

# 布隆过滤器
# 归并排序
    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) >> 1; 

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 中间数组
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid)   temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(a, start1, b, start2, length)
    }
    
# 快排
    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    static int partition(int[] a, int begin, int end) {
        // pivot: 标杆位置，counter: 小于pivot的元素的个数
        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++) {
            if (a[i] < a[pivot]) {
                int temp = a[counter]; a[counter] = a[i]; a[i] = temp;
                counter++;
            }
        }
        int temp = a[pivot]; a[pivot] = a[counter]; a[counter] = temp;
        return counter;
    }