package code;

import code.util.SubCollectionType;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemsImpl implements Problems{

    @Override
    public boolean checkPalindrom(char [] word){
        if (word == null)
            throw new NullPointerException("the string is null");

        for(int i=0;i<word.length/2;i++){
            if (word[i] != word[word.length-1-i]) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String getIndiceNumbersNotInOrder(int [] intArr){
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());
//    .sorted(Comparator.reverseOrder())

        List<Integer> sortedIntList = intList.stream().sorted().collect(Collectors.toList());

        return IntStream.range(0, intList.size())
                .filter(index -> !intList.get(index).equals(sortedIntList.get(index)))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

    }


    // varargs method
    @Override
    public String concatString(String... strings) {
        return String.join("",strings);
    }

//    generic method
    @Override
    public <T> T get(T object) {
        return object;
    }

    @Override
    public String getCorrectCollectionTClass(boolean keyValue, boolean order, boolean unique,boolean fifoLifo,boolean indexing, boolean addSpeed, boolean deleteSpeed, boolean getSpeed, boolean memory,boolean sort) {

        SubCollectionType choiceType = new SubCollectionType("", keyValue, order, unique, fifoLifo, indexing, addSpeed,deleteSpeed, getSpeed, memory,sort);


        // Defined Types
        List<SubCollectionType> subTypes = new ArrayList<>();
        // List
        SubCollectionType arrayListType = new SubCollectionType("ArrayList",false,true,false,false,true,false,false,true,false,false);
        SubCollectionType linkedListType = new SubCollectionType("LinkedList",false,true,false,false,true,true,true,false,false,false);
        // Set
        SubCollectionType hashSetType = new SubCollectionType("HashSet",false,false,true,false,false,true,true,true,false,false);
        SubCollectionType linkedHashSetType = new SubCollectionType("LinkedHashSet",false,true,true,false,false,true,true,true,false,false);
        SubCollectionType treeSetType = new SubCollectionType("TreeSet",false,false,true,false,false,false,false,false,false,true);
        SubCollectionType enumSetType = new SubCollectionType("EnumSet",false,true,true,false,false,true,true,true ,false,false);
        // Queue
//        SubCollectionType arrayDequeType = new SubCollectionType("ArrayDeque",false,true,false,false,true,false,false,true,false);
//        SubCollectionType priorityQueueType = new SubCollectionType("PriorityQueue",false,true,false,true,null,false,false,true,false);
        // Map
        SubCollectionType hashMapType =       new SubCollectionType("HashMap",true,false,false,false,false,true,true,true,false,false);
        SubCollectionType linkedHashMapType = new SubCollectionType("LinkedHashMap",true,true,false,false,false,true,true,true,false,false);
        SubCollectionType treeMapType =       new SubCollectionType("TreeMap",true,false,false,false,false,false,false,false,false,false);
        SubCollectionType enumMapType =       new SubCollectionType("EnumMap",true,false,false,false,false,true,true,true,false,false);


        subTypes.add(arrayListType);
        subTypes.add(linkedListType);

        subTypes.add(hashSetType);
        subTypes.add(linkedHashSetType);
        subTypes.add(treeSetType);
        subTypes.add(enumSetType);

        subTypes.add(hashMapType);
        subTypes.add(linkedHashMapType);
        subTypes.add(treeMapType);
        subTypes.add(enumMapType);



         ;

        // Filter elements with the maximum score

        subTypes = subTypes.stream()
                .filter(s -> s.getScoreA(choiceType)).collect(Collectors.toList()) ;

        Optional<Integer> maxScore = subTypes.stream()
                .map(s -> s.getScoreB(choiceType))
                .max(Integer::compareTo);

        // Filter elements with the maximum score
        String result = "";
        result = maxScore.isPresent()? subTypes.stream()
                    .filter(s -> s.getScoreB(choiceType) == maxScore.get()).map(s -> s.getName()).collect(Collectors.joining(", ")):"No Type Matches Requirement";


        return result;
    }
    //List
    //ArrayList
    //LinkedList

    //Set
    //HashSet
    //LinkedHashSet
    //TreeSet
    //EnumSet

    //Queue
    //ArrayDeque
    //PriorityQueue

    //Map
    //HashMap
    //LinkedHashMap
    //TreeMap
    //EnumMap



}
