def partition(arr, start, end):
    pivot = arr[end]
    i = start - 1
    for j in range(start, end):
        # print(arr[j], pivot)
        if arr[j] <= pivot:
            i += 1
            arr[j], arr[i] = arr[i], arr[j]

    arr[end], arr[i+1] = arr[i+1], arr[end]
    return i+1

def quickSort(arr, start, end):
    if start < end:
        pivot = partition(arr, start, end)
        # print(arr)
        quickSort(arr, start, pivot-1)
        quickSort(arr, pivot+1, end)
    return arr

def mergeSort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        left = arr[:mid]
        right = arr[mid:]
        mergeSort(left)
        mergeSort(right)
        i = j = k = 0
        while i < len(left) and j < len(right):
            print(left, right)
            if left[i] < right[j]:
                arr[k] = left[i]
                i += 1
                k += 1
            else:
                arr[k] = right[j]
                j += 1
                k += 1
        while i < len(left):
            arr[k] = left[i]
            i += 1
            k += 1
        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1
    return arr

def heapify(arr, n, i):
    largest = i
    l = 2*i + 1
    r = 2*i + 2
    if l < n and arr[largest] < arr[l]:
        largest = l
    if r < n and arr[largest] < arr[r]:
        largest = r
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)

def heapSort(arr):
    n = len(arr)
    for i in range(n//2 - 1, -1, -1):
        heapify(arr, n, i)
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)
    return arr

if __name__ == '__main__':
    arr = [10, 7, 8, 9, 1, 5]
    print(quickSort(arr, 0, len(arr)-1))
    arr = [10, 7, 8, 9, 1, 5]
    print(mergeSort(arr))