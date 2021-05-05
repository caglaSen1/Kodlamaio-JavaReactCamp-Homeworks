package Concrete;

import java.util.Scanner;

import Abstract.CampaignService;
import Abstract.Logger;
import Entities.Campaign;
import Utils.Utils;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("The " + campaign.getName().toUpperCase() + " campaign has been added to the system");

	}

	@Override
	public void update(Campaign campaign) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the new name : ");
		campaign.setName(scan.nextLine());

		System.out.print("Please enter the new discount : ");
		campaign.setDiscount(scan.nextInt());

		System.out.println("The campaign has been updated");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The " + campaign.getName() + " campaign has been deleted from the system");

	}

}
