package com.test5;
import java.util.Scanner;

public class BoardCover {
    // �������̵Ĵ�С��2^k����Ҫ�Ĺ������ǣ�(4^k-1)/3
	static Scanner scanner1 = new Scanner(System.in);
	static{System.out.println("������K��ֵ");}
	 static int K=scanner1.nextInt(); 
   static int BOARD_SIZE=(int) Math.pow(2, K);
	
    // ����һ����ά��������ģ������
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    // ����һ��ȫ�ֱ�����������¼���Ƶı��
    private static int tile = 0;

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("���̵Ĵ�СΪ��" + BOARD_SIZE);
        System.out.println("���������ⷽ�����ڵ��кţ�");
        int dr = scanner.nextInt();
        System.out.println("���������ⷽ�����ڵ��кţ�");
        int dc = scanner.nextInt();
        scanner.close();
        // �кź��к����λ������±���� 1
        chessBoard(0, 0, dr - 1, dc - 1, BOARD_SIZE);
        System.out.println("���ⷽ���ڵ� " + dr + " �е� " + dc + "�У����Ǻ�����̣�");
        // �������
        printBoard();
    }

    /**
     *  tr���������ϽǷ�����к�
     *  tc:�������ϽǷ�����к�
     *  dr�����ⷽ�����ڵ��к�
     *  dc�����ⷽ�����ڵ��к�
     *  size����ǰ���̵Ĵ�С
     */
    private static void chessBoard(int tr, int tc, int dr, int dc, int size) {
        /* 1����ǰ���̵Ĵ�С�� 1 �ͷ��� */
        if (size == 1) {
            return;
        }
        
        int t = tile++;
        // �ָ����̣����̴�С����
        int s = size / 2;

        /* 2���������Ͻ������� */
        if (dr < tr + s && dc < tc + s) {
            // ���ⷽ���ڴ�������
            chessBoard(tr, tc, dr, dc, s);
        } else {
            // ���ⷽ���ڴ������У��� t �Ź��Ƹ������½�
            board[tr + s - 1][tc + s - 1] = t;
            // �������෽��
            chessBoard(tr, tc, tr + s - 1, tc + s - 1, s);
        }

        /* 3���������Ͻ������� */
        if (dr < tr + s && dc >= tc + s) {
            // ���ⷽ���ڴ�������
            chessBoard(tr, tc + s, dr, dc, s);
        } else {
            // ���ⷽ���ڴ������У��� t �Ź��Ƹ������½�
            board[tr + s - 1][tc + s] = t;
            // �������෽��
            chessBoard(tr, tc + s, tr + s - 1, tc + s, s);
        }

        /* 4���������½������� */
        if (dr >= tr + s && dc < tc + s) {
            // ���ⷽ���ڴ�������
            chessBoard(tr + s, tc, dr, dc, s);
        } else {
            // ���ⷽ���ڴ������У��� t �Ź��Ƹ������Ͻ�
            board[tr + s][tc + s - 1] = t;
            // �������෽��
            chessBoard(tr + s, tc, tr + s, tc + s - 1, s);
        }

        /* 5���������½������� */
        if (dr >= tr + s && dc >= tc + s) {
            // ���ⷽ���ڴ�������
            chessBoard(tr + s, tc + s, dr, dc, s);
        } else {
            // ���ⷽ���ڴ������У��� t �Ź��Ƹ������Ͻ�
            board[tr + s][tc + s] = t;
            // �������෽��
            chessBoard(tr + s, tc + s, tr + s, tc + s, s);
        }
    }

    // �������
    private static void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

}