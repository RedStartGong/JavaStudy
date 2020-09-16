package com.mhys.cinima;

import java.util.Scanner;

public class Menu {
    private static Cinema cinema;
    private static Scanner scanner;

    public static void main(String[] args) {
        init();
        showMenu();
    }

    private static void init() {
        cinema = new Cinema();
        scanner = new Scanner(System.in);

    }

    private static void showMenu() {
        System.out.println("-------欢迎来到豪华影院管理系统-------");
        System.out.println("输入一下数字选择您像进行的操作");
        System.out.println("1: 添加电影");
        System.out.println("2: 查看已有电影");
        System.out.println("任意字符: 退出系统");
        String tag = scanner.next();

        if (tag.equals("1")) {
            addMovie();
        } else if (tag.equals("2")) {
            showMovie();
        } else {
            System.out.println("本系统已退出");
        }
    }

    private static void addMovie() {
            System.out.println("请输入电影名字：");
            String name = scanner.next();
            System.out.println("请输入电影类型：");
            String type = scanner.next();
            System.out.println("请输入电影价格(输入整数):");
            int price = scanner.nextInt();
            Movie movie = new Movie(name, type, price);
            cinema.addMovie(movie);
            System.out.println("电影添加成功！");
            showMenu();
    }

    private static void showMovie() {
        cinema.showMovies();
        showMenu();
    }
}
