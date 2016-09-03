package org.manyu.lefim;

import org.apache.commons.cli.*;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlgoLEFIM algoLEFIM =new AlgoLEFIM();
        CommandLine commandLine;
        Options options=new Options();
        CommandLineParser parser =new DefaultParser();
        options.addOption("i", true, "get input file");
        options.addOption("o",true, "get output file");
        options.addOption("tm", true, "set transaction merging");
        options.addOption("c", true, "get transaction count");
        options.addOption("sup", true, "set subtree utility pruning");
        options.addOption("minu",true,"set min Utility");
        options.addOption("minl",true,"set min Length");
        options.addOption("maxl",true,"set max Length");
        String inputPath="";
        String outputPath="";
        int maximumTransactionCount =0;
        boolean activateTransactionMerging=true;
        boolean activateSubtreeUtilityPruning=true;
        int minLength=0;
        int maxLength=10;
        int minUtility=0;
        try{
            commandLine=parser.parse(options,args);
            inputPath=commandLine.getOptionValue("i");
            outputPath=commandLine.getOptionValue("o");
            maximumTransactionCount=Integer.parseInt(commandLine.getOptionValue("c"));
            activateSubtreeUtilityPruning=Boolean.parseBoolean(commandLine.getOptionValue("sup"));
            activateTransactionMerging=Boolean.parseBoolean(commandLine.getOptionValue("tm"));
            minUtility=Integer.parseInt(commandLine.getOptionValue("minu"));
            minLength=Integer.parseInt(commandLine.getOptionValue("minl"));
            maxLength=Integer.parseInt(commandLine.getOptionValue("maxl"));
            algoLEFIM.runAlgorithm(minUtility,inputPath,outputPath,activateTransactionMerging,maximumTransactionCount,activateSubtreeUtilityPruning,minLength,maxLength);
            algoLEFIM.printStats();
        }catch(ParseException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
