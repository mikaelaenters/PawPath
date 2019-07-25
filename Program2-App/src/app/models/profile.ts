import { User } from './user';

export class Profile {

    profileId: number;
    phoneNumber: string;
    creditCard: string;
    address: string;
    city: string;
    state: string;
    zipCode: string;
    bio: string;
    user: User;
}
