package com.msz.SpringBootAlgorithmApi.Controller;


import com.msz.SpringBootAlgorithmApi.Algorithms.BubbleSort.BubbleSortAlgorithm;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class BubbleSortController {

    private int[] arrayToSort = {-1, 4, -3, 2, 51};

    @GetMapping("/hello")
    public String getHello() {
        return "helloworld";
    }

    @GetMapping("/getUnsortedList")
    public int[] arrayToReturn() {

        return arrayToSort;
    }

    @GetMapping("/getSortedList")
    public int[] sortedArrayToReturn() {
        BubbleSortAlgorithm temp = new BubbleSortAlgorithm();
        return temp.bubbleSortMethodAscending(arrayToSort);
    }

    @PutMapping("/sortArray2")
    public int[] sortArraySimpleMethod(@RequestBody int[] arrayFromCustomer) {
        BubbleSortAlgorithm temp = new BubbleSortAlgorithm();
        return temp.bubbleSortMethodAscending(arrayFromCustomer);
    }

    @PutMapping("/sortArray")
    public ResponseEntity<int[]> sortArrayWithResponseEntity(@RequestBody int[] arrayFromCustomer) {
        BubbleSortAlgorithm temp = new BubbleSortAlgorithm();
        return ResponseEntity.ok(temp.bubbleSortMethodAscending(arrayFromCustomer));
    }


}
