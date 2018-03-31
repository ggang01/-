
public class Heap {

	public static void main(String[] args) {

		int[] arr = { 11, 10, 30, 5, 2 };

		HeapSort(arr);
		System.out.println("힙 정렬");

		for (int i = 1; i < arr.length + 1; i++) {

			System.out.println(itemHeap[i]);

		}

	}

	public static void HeapSort(int[] arr) {

		Heap heap = new Heap();

		for (int i = 0; i < arr.length; i++) {

			heap.insertHeap(arr[i]);

		}

		for (int i = arr.length - 1; i >= 0; --i) {

			arr[i] = heap.deleteHeap();

		}

	}

	private int heapSize;
	static int itemHeap[];

	public Heap() {

		heapSize = 0;

		itemHeap = new int[50];

	}

	public void insertHeap(int item) { // Heap을 구성

		int i = ++heapSize;

		while ((i != 1) && (item > itemHeap[i / 2])) {// 이 부분에서 새로들어오는 값과 중간 위치 값을 비교하여 큰값이 노드 맨위(중간)로 오도록 함.

			itemHeap[i] = itemHeap[i / 2];

			i /= 2;

		}

		itemHeap[i] = item;

	}

	public int getHeapSize() {

		return this.heapSize;

	}

	public int deleteHeap() {

		int parent, child;

		int item, tmp;

		item = itemHeap[1];

		tmp = itemHeap[heapSize--];

		parent = 1;// 최상 노드

		child = 2;// 자식 노드

		while (child <= heapSize) {

			if ((child < heapSize) && (itemHeap[child] < itemHeap[child + 1]))

				child++;

			if (tmp >= itemHeap[child])

				break;

			itemHeap[parent] = itemHeap[child];

			parent = child;// 최상위 노드는 삭제 후 자식노드 중 가장큰 수 최상위로 올림.

			child *= 2;

		}

		itemHeap[parent] = tmp; // 자식노드 정렬

		return item;

	}

}
