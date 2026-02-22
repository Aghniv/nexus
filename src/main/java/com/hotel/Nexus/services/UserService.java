package com.hotel.Nexus.services;

import com.hotel.Nexus.dtos.LoginRequest;
import com.hotel.Nexus.dtos.RegistrationRequest;
import com.hotel.Nexus.dtos.Response;
import com.hotel.Nexus.dtos.UserDTO;
import com.hotel.Nexus.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
