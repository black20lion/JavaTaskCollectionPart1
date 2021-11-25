Лабораторная работа по коллекциям
Выполнил: Сахокия Константин

Целью данного исследования было изучение работы Collection Framework
стандартной библиотеки java.util и практическое определение 
скорости работы основных коллекций на операциях добавления,
вставки и удаления элементов. Также одной из задач являлось
написание собственной реализации связного списка (Linked List).

Работа состоит из 4-частей:

1)Сравнение производительности java.util.LinkedList и собственной
реализации связного списка для основных операций.

2)Сравнение производительности ArrayList и Linkedlist для
основных операций.

3)Сравение производительности HashSet, LinkedHashSet, TreeSet
для основных операций.

4)Сравнение производительности HashMap, LinkedHashMap, TreeMap
для основных операций. 


			Часть 1. java.util.Linkedlist и собственный лист

В процессе работы мной был описан собственный класс LinkedList, реализованы
основные методы. Мой LinkedList оказался медленнее стандартного,
возможно это связано с тем, что необходимые методы были реализованы
более "наивно", без вспомогательных функций. Тем не менее, производительность
моего связного списка пропорциональна производительности стандартного при выполнении 
всех основных операций, что говорит о том, что структура данных была реализована верно.

			Таблица 1. Время работы MyLinkedList для основных операций
