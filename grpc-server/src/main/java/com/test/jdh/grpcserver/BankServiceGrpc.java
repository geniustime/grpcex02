package com.test.jdh.grpcserver;

import com.test.jdh.grpc.grpcmodel.Bank;
import com.test.jdh.grpc.grpcmodel.bankGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BankServiceGrpc extends bankGrpc.bankImplBase {

    // default acc
    private double[] accounts = {0, 100, 40};

    // noti
    private Map<Integer, Queue<Bank.AccountNotification>> map = new HashMap<>();


    // just initialize?
    public BankServiceGrpc(){
        super();
        map.put(0, new ConcurrentLinkedQueue<Bank.AccountNotification>());
        map.put(1, new ConcurrentLinkedQueue<Bank.AccountNotification>());
        map.put(2, new ConcurrentLinkedQueue<Bank.AccountNotification>());
    }

    @Override
    public void transfer(Bank.TransferMoney request, StreamObserver<Bank.TransferConfirmation> responseObserver) {
        super.transfer(request, responseObserver);
    }

    @Override
    public void listenToNotifications(Bank.Account request, StreamObserver<Bank.AccountNotification> responseObserver) {
        super.listenToNotifications(request, responseObserver);
    }

    @Override
    public StreamObserver<Bank.RequestMoney> requestTransfer(StreamObserver<Bank.RequestStatus> responseObserver) {
        return super.requestTransfer(responseObserver);
    }

    // ??
    private void processRequest(int fromAccont, int toAccount, double amount){

    }

    private Bank.AccountNotification accountNotify(int acc, double amount, Bank.NotificationType type){

    }

    private boolean transferMoney(int fromAccount, int toAccount, double amount){

    }
}
