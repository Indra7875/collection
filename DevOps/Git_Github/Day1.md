### Git
- Git is a distributed version control tool.

**What is version control tool ?**
- It allows you to revert selected files back to a previous state, revert the entire project back to a previous state.
-  compare changes over time
-   see who last modified something that might be causing a problem
- who introduced an issue and when, and more.
- If lose files, you can easily recover

- There are Three types of version control system.
- 1. Local Version Control System (LVCS)
- 2. Centralized Version Control System (CVS)
- 3. Distributed Version Control System (DVCS)

#### 1. Local Version Control System (LVCS)
- Many people’s version-control method of choice is to copy files into another directory
- programmers long ago developed local VCSs that had a simple database that
kept all the changes to files under revision control.
- Ref fig1

#### 2. Centralized Version Control System (CVS)
- The next major issue that people encounter is that they need to collaborate with developers on other systems. 
- To deal with this problem, Centralized Version Control Systems (CVCSs) were developed.
- It have a single server that contains all the versioned files, and a number of clients that check out files from that central place.
- This setup also has some serious downsides. The most obvious is the single point of failure that the centralized server represents. If that server goes down for an hour, then during that hour nobody can collaborate at all or save versioned changes to anything they’re working on.
- If the hard disk the central database is on becomes corrupted, and proper backups haven’t been kept, you lose
absolutely everything.
- Ref fig2

#### 3. Distributed Version Control System (DVCS)
- This is where Distributed Version Control Systems (DVCSs) step in. In a DVCS (such as Git, Mercurial or Darcs), 
- Clients don’t just check out the latest snapshot of the files; rather, they fully mirror the repository, including its full history. Thus, if any server dies, and these systems were collaborating via that server, any of the client repositories can be copied back up to the server to restore it. Every
clone is really a full backup of all the data.
- Ref fig3

#### How Git Works ?
- Git basically takes a picture of what all your files look like at that moment and stores a reference to that snapshot. 
- To be efficient, if files have not changed, Git doesn’t store the file again,just a link to the previous identical file it has already stored.
- Git thinks about its data more like a stream of snapshots.
- Nearly Every Operation Is Local.

