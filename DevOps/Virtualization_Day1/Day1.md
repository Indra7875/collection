### Virtualization
#### What is Virtualization ?
- It is the technique of splitting/adding the physical resources into as many logical resources as we want.
- e.g. CPU, Memory
- OR
- Virtualization is a technology that transform hardware into software. 

#### Physical Data Center Case Study
- 1. 2000 square foot data center.
- 2. 100 physical servers (30 for Infra, 70 for application) which having 32 GB RAM, 5TB ROM, 8 Core CPU
- 3. Cooling System for 100 servers
- 4. 100 physical disk for servers
- 5. Cabling for 100 servers and power whips.
- 6. Staff (3 shift)
- 7. Electricity and power backup

#### What is Hypervisor 
- Hypervisor is a piece of software or firmware that creates and the the virtual machine.
- A hypervisor is sometimes also called a virtual machine manager (VMM).

#### Types of Hypervisor 
1. Type-1 Hypervisor / Bare Metal / Native Hypervisor
2. Type-2 Hypervisor / Hosted Hypervisor

**1. Type-1 Hypervisor / Bare Metal / Native Hypervisor**
- It mostly used in Enterprise Level.
- It is installed as firmware.
- Type-1 hypervisor run directly on system hardware.
- A guest O.S. runs on another level above the hypervisor.
- VMware ESXi is a Type-1 hypervisor that runs on host server hardware without an underlying O.S.
- Type-1 hypervisor act as their own operating system.
- ESXi provides virtualization layer that abstracts the CPU, Storage, Memory and networking resources of physical host into multiple virtual machines.

**1. Type-2 Hypervisor / Hosted Hypervisor**
- It mostly used in personal/testing.
- It is installed as software.
- Examples of Type-2 Hypervisor are VMware Workstation, Oracle VirtualBox, and Microsoft Virtual PC.
- It does not have direct access to the host Hardware and Resources.

#### Difference between Type-1 Hypervisor and Type-2 Hypervisor
| **Criteria**               | **Type-1 Hypervisor**                                              | **Type-2 Hypervisor**                                                      |
| -------------------------- | ------------------------------------------------------------------ | -------------------------------------------------------------------------- |
| **1. aka**                 | Bare Metal & Native                                                | Hosted                                                                     |
| **2. Virtualization**      | Hardware Virtualization                                            | OS Virtualization                                                          |
| **3. Operation**           | Gust OS & applications run on the Hypervisor                       | Run as an application on host OS                                           |
| **4. Scalability**         | Better Scalability                                                 | Not so much because it's resilience on the underlying OS                   |
| **5. System Independence** | Has direct access to hardware along with virtual machine it's host | Are not allowed to directly access the host hardware and it's resources    |
| **6. Performance**         | Higher performance as there is no middle layer                     | Comparatively has reduce performance rate as it runs with extend overhead. |
| **7. Security**            | More Secure                                                        | Less Secure, as any problem with base OS affects the entire system.        |
| **8. Examples**            | VMware ESXi, Hyper-V                                               | VMware Workstation, Oracle VirtualBox                                      |
  

  