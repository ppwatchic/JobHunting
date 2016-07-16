###Heap Srot
**Q:Runtime complexitity of Heap Sort, When is it suitable to apply Heap Sort? Why not Quick Sort? cons of Heap Sort?**

**A:** A binary heap is a complete binary tree where items are stored in a specific order such that value in a parent node is always greater/smaller than values in the children. One is called max heap while the other is called min heap. 

The heap can be represented by a binary tree or array. 

Heap Sort Algorithm in ascending/increasing order: 
1. Build a max heap from input data;
2. At the point, the largest data is stored at the root of the heap. Replace it with the last item in the heap followed by reduced the size of heap by 1. Finary heapify the root of the tree. 
3. Repeat above steps until the size of heap is no greater than 1. 



