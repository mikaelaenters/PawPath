export class UserController {
    userId: number;
    username: string;
    password: string;
    userRole: string;
    fullname: string;

    constructor(userId: number, username: string, password: string, userRole: string, fullname: string){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        this.fullname = fullname;
    }
}
